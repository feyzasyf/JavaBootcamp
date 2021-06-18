package hrms.hrms.core.adapters;



import hrms.hrms.entitites.dtos.CandidateDto;

public interface IdValidationService {
//Mernis Dogrulama Simulasyonu
	boolean checkIfRealPerson(CandidateDto candidateDto);
}
