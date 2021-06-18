package hrms.hrms.entitites.concretes;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Table(name="verification_token")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class VerificationToken {
	
private static final int EXPIRATION= 60*24;

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="token_id")
	private int tokenId;


	private String token;

	private Date expiryDate;

@OneToOne(targetEntity=User.class, fetch= FetchType.EAGER)
@JoinColumn(name="user_id", nullable=false)
	private User user;
	



public VerificationToken(final User user) {
	super();
	
	this.token = UUID.randomUUID().toString();
	this.user = user;
	this.expiryDate = calculateExpiryDate(EXPIRATION);
}
private Date calculateExpiryDate(int time) {
	Calendar cal = Calendar.getInstance();
	cal.setTime(new Timestamp(cal.getTime().getTime()));	
	cal.add(Calendar.MINUTE, time);
	return new Date(cal.getTime().getTime());

}
}
