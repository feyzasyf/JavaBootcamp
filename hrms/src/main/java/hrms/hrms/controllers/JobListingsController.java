package hrms.hrms.controllers;

import java.time.LocalDate;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobListingService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entitites.concretes.JobListing;
import hrms.hrms.entitites.dtos.JobListingWithEmployerDto;

@RestController
@RequestMapping("/api/jobListings/")
public class JobListingsController {
	
	private JobListingService jobListingService;

	@Autowired
	public JobListingsController(JobListingService jobListingService) {
		super();
		this.jobListingService = jobListingService;
	}
	
@PostMapping("add")
public Result add(@RequestBody JobListing jobListing){
	return this.jobListingService.add(jobListing);
}
	
	@GetMapping("getAll")
	public DataResult<List<JobListing>> getAll(){
		return this.jobListingService.getAll();
	}
	
	@GetMapping("getActiveJobListingWithEmployerDetails")
		public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetails(){
		return this.jobListingService.getActiveJobListingWithEmployerDetails();
	}
	
	@GetMapping("getActiveJobListingWithEmployerDetailsByDate")
	public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByDate(@RequestParam LocalDate dateListed){
	return this.jobListingService.getActiveJobListingWithEmployerDetailsByDate(dateListed);
}
	@GetMapping("getActiveJobListingWithEmployerDetailsByEmployer")
	public DataResult<List<JobListingWithEmployerDto>> getActiveJobListingWithEmployerDetailsByEmployer(@RequestParam int employerId){
	return this.jobListingService.getActiveJobListingWithEmployerDetailsByEmployer(employerId);
}
	
	
	

}
