package hrms.hrms.entitites.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password") //the length should be 80, BCrypt encoding
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	public User() {
		super();
		this.enabled=false;
		}
	
	
	//String matchingPassword for password check, will later be implemented in UserDto
	
	
}



