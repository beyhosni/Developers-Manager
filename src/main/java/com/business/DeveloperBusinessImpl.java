package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeveloperRepository;
import com.dao.ProgrammingLanguageRepository;
import com.entities.Developer;
import com.entities.ProgrammingLanguage;
@Service
public class DeveloperBusinessImpl implements DeveloperBusiness{

	@Autowired
	private DeveloperRepository developerRepository;
	
	@Autowired
	private ProgrammingLanguageRepository programmingLanguageRepository;
	

	@Override
	public Developer add(Developer developer) {
		return developerRepository.save(developer);
		
	}

	@Override
	public void edit(Developer developer) {
		developerRepository.save(developer);
		
	}

	@Override
	public List<Developer> allDeveloper() {
		return developerRepository.findAll();
	}

	@Override
	public Developer addProgrammationLanguage(Long developerId, Long progLanguageId) {
		Developer developer = developerRepository.findOne(developerId);
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findOne(progLanguageId);
		programmingLanguage.getDevelopers().add(developer);
		developer.getLanguages().add(programmingLanguage);
		return developerRepository.save(developer);
	}

	@Override
	public List<Developer> getDevelopersByLanguageName(String languageName) {		
		return developerRepository.getDevelopersByLanguageName(languageName);
	}
	
}
