package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entitites.concretes.Candidate;
import hrms.hrms.entitites.dtos.CandidateDto;


public interface CandidateService {
DataResult<List<Candidate>> getAll();
Result registerNewCandidate(CandidateDto candidateDto);
Result saveVerifiedCandidate(Candidate candidate);
Result add(Candidate candidate);
	
}
