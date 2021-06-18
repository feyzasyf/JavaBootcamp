package hrms.hrms.core.adapters;


import org.springframework.stereotype.Service;

import hrms.hrms.entitites.dtos.CandidateDto;

@Service
public class fakeMernisServiceAdapter implements IdValidationService{

	@Override
	public boolean checkIfRealPerson(CandidateDto candidateDto) {
		
		//Mernis simulasyonu
		return true;
	}

}
