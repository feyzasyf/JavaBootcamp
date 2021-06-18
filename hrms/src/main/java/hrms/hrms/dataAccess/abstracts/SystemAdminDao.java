package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.SystemAdmin;

public interface SystemAdminDao extends JpaRepository<SystemAdmin, Integer>{

}
