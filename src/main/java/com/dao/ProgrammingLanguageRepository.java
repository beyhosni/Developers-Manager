package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.ProgrammingLanguage;


public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long>{

}
