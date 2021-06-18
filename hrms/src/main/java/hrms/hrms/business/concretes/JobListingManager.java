package hrms.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobListingService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobListingDao;
import hrms.hrms.entitites.concretes.JobListing;
import hrms.hrms.entitites.dtos.JobListingWithEmployerDto;

@Service
public class JobListingManager implements JobListingService{
	@Autowired
	private JobListingDao jobListingDao;

	
	
	@Override
	public DataResult<List<JobListing>> getAll(){
		return new SuccessDataResult<List<JobListing>>(this.jobListingDao.findAll(),"Data listelendi.");
	}

	@Override
	public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetails() {
		return new SuccessDataResult<List<JobListingWithEmployerDto>>(this.jobListingDao.getActiveJobListingWithEmployerDetails(), "Data listelendi");
	}

	@Override
	public Result add(JobListing jobListing) {
		this.jobListingDao.save(jobListing);
		return new SuccessResult( "Data Listelendi");
	}

	@Override
	public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByDate(
			LocalDate dateListed) {
		return new SuccessDataResult<List<JobListingWithEmployerDto>>(this.jobListingDao.getActiveJobListingWithEmployerDetailsByDate(dateListed),"Data listelendi");
	}

	@Override
	public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByEmployer(
			int employerId) {
		return new SuccessDataResult<List<JobListingWithEmployerDto>>(this.jobListingDao.getActiveJobListingWithEmployerDetailsByEmployer(employerId));
	}
	

}
