package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long>{
	
	@Query("SELECT d FROM Developer d JOIN d.languages l where l.name = :languageName") 
	public List<Developer> getDevelopersByLanguageName(@Param("languageName") String languageName);
}
