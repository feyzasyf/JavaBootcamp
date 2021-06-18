package hrms.hrms.entitites.dtos;


import hrms.hrms.core.utilities.validators.FieldsMatch;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldsMatch.List({@FieldsMatch(field = "password", matchingField = "matchingPassword", message = "The password fields must match!") })
public class CandidateDto {

	@NotNull
	@NotBlank
	@Email
	String email;
	
	
	@NotNull
	@NotBlank
	private String password;
	private String matchingPassword;
	
	
	@NotNull
	@NotBlank
	private String firstName;
	
	@NotNull
	@NotBlank
	private String lastName;
	
	@NotNull
	@NotBlank
	private String identityNumber;
	
	@NotNull
	
	private int yearOfBirth;
}
