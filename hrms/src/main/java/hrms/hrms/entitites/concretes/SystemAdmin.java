package hrms.hrms.entitites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "system_admins")
@PrimaryKeyJoinColumn(name="system_admin_id", referencedColumnName = "user_id")
public class SystemAdmin extends User {

	@Column(name="admin_name")
	private String adminName;
	
}
