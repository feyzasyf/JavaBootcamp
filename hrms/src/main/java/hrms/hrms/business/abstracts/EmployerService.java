package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;

import hrms.hrms.entitites.concretes.Employer;
import hrms.hrms.entitites.dtos.EmployerDto;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result registerNewEmployer(EmployerDto employerDto);
	Result saveVerifiedEmployer(Employer employer);
	Result add(Employer employer);
		
}
