package hrms.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entitites.concretes.JobListing;
import hrms.hrms.entitites.dtos.JobListingWithEmployerDto;



public interface JobListingService {
	Result add(JobListing jobListing);
DataResult<List<JobListing>> getAll();
DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetails();
DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByDate(LocalDate dateListed);	
DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByEmployer(int employerId);	
}

