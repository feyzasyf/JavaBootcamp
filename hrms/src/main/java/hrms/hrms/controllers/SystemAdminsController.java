package hrms.hrms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hrms.hrms.business.abstracts.SystemAdminService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entitites.concretes.SystemAdmin;

@RestController
@RequestMapping("/api/systemadmins")
public class SystemAdminsController {
	

	@Autowired
	private SystemAdminService systemAdminService;
	
	@GetMapping("getall")
	public DataResult<List<SystemAdmin>> getAll(){
		return this.systemAdminService.getAll();
		
	}


}
