package com.demo.vocabapp.dao;

import com.demo.vocabapp.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
