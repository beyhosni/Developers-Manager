package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProgrammingLanguageRepository;
import com.entities.ProgrammingLanguage;

@Service
public class ProgLanguageBusinessImpl implements ProgLanguageBusiness {
	@Autowired
	ProgrammingLanguageRepository programmingLanguageRepository;

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void edit(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> allProgLanguage() {
		return programmingLanguageRepository.findAll();
	}

}
