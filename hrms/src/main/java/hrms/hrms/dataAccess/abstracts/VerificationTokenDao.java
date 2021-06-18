package hrms.hrms.dataAccess.abstracts;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.User;
import hrms.hrms.entitites.concretes.VerificationToken;

public interface VerificationTokenDao extends JpaRepository<VerificationToken, Integer> {
User findByToken(String token);
void deleteByExpiryDateLessThan(Date now);
}
