package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entitites.concretes.Candidate;



public interface CandidateDao extends JpaRepository<Candidate, Integer> {
Candidate findByEmail(String email);
Candidate findByIdentityNumber(String identityNumber);
//void save(CandidateDto candidateDto);

}
