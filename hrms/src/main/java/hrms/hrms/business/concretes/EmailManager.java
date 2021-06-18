package hrms.hrms.business.concretes;


import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmailService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;


@Service
public class EmailManager implements EmailService{

	//simulasyon	
	@Override
	public Result send() {
		
		return new SuccessResult("Aktivasyon linki gonderildi.");
		
	}

}
