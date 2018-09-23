package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.business.DeveloperBusiness;
import com.business.ProgLanguageBusiness;
import com.entities.Developer;
import com.entities.ProgrammingLanguage;

@RestController
public class ApplicationRestfulService {
	@Autowired
	private DeveloperBusiness developerBusiness;
	
	@Autowired
	private ProgLanguageBusiness progLanguageBusiness ;
	
	
	@RequestMapping(value = "/developer/add", method = RequestMethod.POST)
	public Developer addDeveloper(@RequestBody Developer developer) {
		return developerBusiness.add(developer);
	}
	
	@RequestMapping(value = "/developer/edit", method = RequestMethod.POST)
	public void editDeveloper(@RequestBody Developer developer) {
		developerBusiness.edit(developer);
	}


	@RequestMapping(value = "/programmingLanguage/add", method = RequestMethod.POST)
	public ProgrammingLanguage addProgLanaguage(@RequestBody ProgrammingLanguage programmingLanguage) {
		return progLanguageBusiness.add(programmingLanguage);
	}
	
	@RequestMapping(value = "/developer/all", method = RequestMethod.GET)
	public List<Developer> addDeveloper() {
		return developerBusiness.allDeveloper();
	}
	
	@RequestMapping(value = "/programmingLanguage/all", method = RequestMethod.GET)
	public List<ProgrammingLanguage> allProgLanaguage() {
		return progLanguageBusiness.allProgLanguage();
	}
	
	@RequestMapping(value="/attributeLanguageToDeveloper",method=RequestMethod.POST)
	public Developer save(@RequestParam Long developerId, @RequestParam Long progLanguageId){
		return developerBusiness.addProgrammationLanguage(developerId, progLanguageId);
	}
	@RequestMapping(value="/findDevelopersByProgrammingLanguage/{langaugeName}",method=RequestMethod.GET)
	public List<Developer> getSms(@PathVariable String langaugeName) {
		return developerBusiness.getDevelopersByLanguageName(langaugeName);
	}


}
