package com.business;

import java.util.List;

import com.entities.Developer;

public interface DeveloperBusiness {
	public Developer add(Developer developer);

	public void edit(Developer developer);

	public List<Developer> allDeveloper();
	
	public Developer addProgrammationLanguage(Long DeveloperId,Long ProgLanguageId);
	
	public List<Developer> getDevelopersByLanguageName(String languageName);
}
