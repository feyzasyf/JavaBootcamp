package hrms.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import hrms.hrms.entitites.concretes.JobListing;

import hrms.hrms.entitites.dtos.JobListingWithEmployerDto;

public interface JobListingDao extends JpaRepository<JobListing, Integer>{
	
	List<JobListing> findAll();

	
	
	@Query("Select new hrms.hrms.entitites.dtos.JobListingWithEmployerDto  "
		+ "(j.jobListingId, p.jobPositionTitle, j.numberOfVacancies, j.dateListed, j.deadline, e.companyName)"
			+ " From JobListing j Inner Join j.employer e Inner Join j.jobPosition p WHERE j.active=true ")
		
	List<JobListingWithEmployerDto> getActiveJobListingWithEmployerDetails();	
	
	@Query("Select new hrms.hrms.entitites.dtos.JobListingWithEmployerDto  "
			+ "(j.jobListingId, p.jobPositionTitle, j.numberOfVacancies, j.dateListed, j.deadline, e.companyName)"
				+ " From JobListing j Inner Join j.employer e Inner Join j.jobPosition p WHERE j.dateListed=: dateListed AND j.active=true  ")
			
		List<JobListingWithEmployerDto> getActiveJobListingWithEmployerDetailsByDate(LocalDate dateListed);	
	
	@Query("Select new hrms.hrms.entitites.dtos.JobListingWithEmployerDto  "
			+ "(j.jobListingId, p.jobPositionTitle, j.numberOfVacancies, j.dateListed, j.deadline, e.companyName)"
				+ " From JobListing j Inner Join j.employer e Inner Join j.jobPosition p WHERE e.id=:employerId AND j.active=true  ")
			
		List<JobListingWithEmployerDto> getActiveJobListingWithEmployerDetailsByEmployer(int employerId);	
	
}
