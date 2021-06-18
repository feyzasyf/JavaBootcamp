package hrms.hrms.entitites.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobListingWithEmployerDto {

	private int jobListingId;
	private String jobPositionTitle;
	private int numberOfVacancies;
	private LocalDate dateListed;
	private LocalDate deadline;
	private String companyName;
	
}
