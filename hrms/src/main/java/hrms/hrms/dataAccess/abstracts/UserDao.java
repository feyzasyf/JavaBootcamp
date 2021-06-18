package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
User findByEmail(String email);
}
