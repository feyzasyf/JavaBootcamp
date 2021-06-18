package hrms.hrms.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hrms.hrms.business.abstracts.EmployerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;

import hrms.hrms.entitites.concretes.Employer;

import hrms.hrms.entitites.dtos.EmployerDto;

@RestController
@RequestMapping("/api/employers/")
public class EmployersController {

	@Autowired
	private EmployerService employerService;
	
	@PostMapping("add")
	public Result Add(@RequestBody Employer employer)	{
		return this.employerService.add(employer);
	}
	
	@PostMapping("register")
	public Result registerNewUser(@Valid @RequestBody EmployerDto employerDto) {
		return this.employerService.registerNewEmployer(employerDto);
	}
	
	@GetMapping("getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		
	}

}
