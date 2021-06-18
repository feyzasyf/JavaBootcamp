package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entitites.concretes.Employer;
import hrms.hrms.entitites.concretes.SystemAdmin;

public interface SystemAdminService {
	DataResult<List<SystemAdmin>> getAll();
	Result verifyEmployer(Employer employer);
}
