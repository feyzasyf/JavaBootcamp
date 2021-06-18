package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
