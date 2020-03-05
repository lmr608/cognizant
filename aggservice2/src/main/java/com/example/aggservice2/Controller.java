package com.example.aggservice2;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(value="/experiment/")
	@ResponseBody
	public List<Model> findAll(){
		return ExperimentService.findAll();
	}
	
	@PostMapping("/experiment/")
	Model newExperiment(@RequestBody Model newExperiment) {
	    return repo2.save(newExperiment);
	  }
}
