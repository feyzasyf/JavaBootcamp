package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.SystemAdminService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;

import hrms.hrms.dataAccess.abstracts.SystemAdminDao;
import hrms.hrms.entitites.concretes.Employer;
import hrms.hrms.entitites.concretes.SystemAdmin;

@Service
public class SystemAdminManager implements SystemAdminService{

	@Autowired
	private SystemAdminDao systemAdminDao; 
	
	@Override
	public DataResult<List<SystemAdmin>> getAll() {
		return new SuccessDataResult<List<SystemAdmin>>(this.systemAdminDao.findAll(),"Data listelendi");
	}
	
	@Override
	public Result verifyEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
