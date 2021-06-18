package hrms.hrms.entitites.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name="job_listings")
public class JobListing {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="job_listing_id")
	private int jobListingId;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	
	@Column(name="number_of_vacancies")
	private int numberOfVacancies;
	
	@Column(name="date_listed")
	private LocalDate dateListed;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="active")
	private boolean active;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	
	
	
	public JobListing() {
		super();
		this.active=true;	}
	
	
	

}
