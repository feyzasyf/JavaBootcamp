package hrms.hrms.entitites.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import hrms.hrms.core.utilities.validators.FieldsMatch;
import hrms.hrms.core.utilities.validators.ValidCompanyEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldsMatch.List({@FieldsMatch(field = "password", matchingField = "matchingPassword", message = "The password fields must match!") })
@ValidCompanyEmail
public class EmployerDto {

	@NotNull
	@NotBlank
    @Email
	private String email;
	
	@NotNull
	@NotBlank
	private String password;
	private String matchingPassword;
	
	@NotNull
	@NotBlank
	private String companyName;
	
	@NotNull
	@NotBlank
	private String website;
	
	@NotNull
	@NotBlank
	private String phoneNumber;
}
