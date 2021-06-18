package hrms.hrms.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CandidateService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entitites.concretes.Candidate;
import hrms.hrms.entitites.dtos.CandidateDto;


@RestController
@RequestMapping("/api/candidates/")
public class CandidatesController {
	
	@Autowired
	private CandidateService candidateService;
	
	@GetMapping("getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
		
	}
	
	@PostMapping("register")
	public Result registerNewUser(@Valid @RequestBody CandidateDto candidateDto) {
		return this.candidateService.registerNewCandidate(candidateDto);
	}

	@PostMapping("add")
	public Result Add(@RequestBody Candidate candidate)	{
		return this.candidateService.add(candidate);
	}
	
	
}
