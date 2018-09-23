package com.business;

import java.util.List;

import com.entities.ProgrammingLanguage;

public interface ProgLanguageBusiness {
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage);

	public void edit(ProgrammingLanguage programmingLanguage);

	public List<ProgrammingLanguage> allProgLanguage();
}
