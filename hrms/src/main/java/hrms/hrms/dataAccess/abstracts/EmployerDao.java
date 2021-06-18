package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.Employer;



public interface EmployerDao extends JpaRepository<Employer, Integer>{
Employer findByEmail(String email);
}
