package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CandidateService;
import hrms.hrms.business.abstracts.EmailService;
import hrms.hrms.core.adapters.IdValidationService;
import hrms.hrms.core.utilities.constants.Messages;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CandidateDao;
import hrms.hrms.entitites.concretes.Candidate;
import hrms.hrms.entitites.dtos.CandidateDto;


@Service
public class CandidateManager implements CandidateService{
	
	@Autowired
	private CandidateDao candidateDao;
	@Autowired
	private IdValidationService idValidationService;
	@Autowired
	private EmailService emailService;

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), Messages.listCandidates);
	}

	@Override
	public Result registerNewCandidate(CandidateDto candidateDto) {
		
		if (!idValidationService.checkIfRealPerson(candidateDto)) {
			return new ErrorResult(Messages.invalidPerson);
		}		
		
		if (this.checkEmailExists(candidateDto.getEmail())) {
			return new ErrorResult(Messages.emailAlreadyExists);
		}
		if (this.checkIdNumberExists(candidateDto.getIdentityNumber())) {
			return new ErrorResult(Messages.idNumberAlreadyExists);
		}
				
		Candidate candidate = new Candidate();
		candidate.setFirstName(candidateDto.getFirstName());
		candidate.setLastName(candidateDto.getLastName());
		candidate.setEmail(candidateDto.getEmail());
		candidate.setPassword(candidateDto.getPassword());
		candidate.setIdentityNumber(candidateDto.getIdentityNumber());
		candidate.setYearOfBirth(candidateDto.getYearOfBirth());
		
		candidateDao.save(candidate);
		emailService.send();	
	  return new SuccessResult(Messages.userActivationRequired);
		
		
	}
	
	private boolean checkEmailExists(String email) {
		return this.candidateDao.findByEmail(email) != null;
	}
	
	private boolean checkIdNumberExists(String idNumber) {
		return this.candidateDao.findByIdentityNumber(idNumber) != null;
	}
	
	
	//to be executed after account activation by email
	@Override
	public Result saveVerifiedCandidate(Candidate candidate) {
		candidate.setEnabled(true);
		this.candidateDao.save(candidate);
		return new SuccessResult(Messages.userVerified);
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult(Messages.userSaved);
	}

}
