package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployerService;
import hrms.hrms.core.utilities.constants.Messages;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EmployerDao;
import hrms.hrms.entitites.concretes.Employer;
import hrms.hrms.entitites.dtos.EmployerDto;

@Service
public class EmployerManager implements EmployerService{

	
	@Autowired
	private EmployerDao employerDao;
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result registerNewEmployer(EmployerDto employerDto) {
		if (this.checkEmailExists(employerDto.getEmail())) {
			return new ErrorResult(Messages.emailAlreadyExists);
		}
		Employer employer = new Employer();
		employer.setCompanyName(employerDto.getCompanyName());
		employer.setEmail(employerDto.getEmail());
		employer.setPassword(employerDto.getPassword());
		employer.setWebsite(employerDto.getWebsite());
		employer.setPhoneNumber(employerDto.getPhoneNumber());
		
		this.employerDao.save(employer);
		return new SuccessResult(Messages.userSaved);
		
	}
		

	private boolean checkEmailExists(String email) {
		return this.employerDao.findByEmail(email) != null;
	}

	@Override
	public Result saveVerifiedEmployer(Employer employer) {
		employer.setEnabled(true);
		this.employerDao.save(employer);
		return new SuccessResult(Messages.userVerified);
	}
	
	@Override
     public Result add(Employer employer) {
    	 this.employerDao.save(employer);
    	 return new SuccessResult(Messages.userSaved);
		
	}

}
