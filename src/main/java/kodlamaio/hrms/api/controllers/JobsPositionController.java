package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;



@RestController
@RequestMapping("api/jobtitle")
public class JobsPositionController {

	private JobTitleService jobTitleService;
	
	public JobsPositionController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	List<JobTitle> getAll(){
		return jobTitleService.getAll();
	}
}
	

