


package com.demo.vocabapp.dao;

import com.demo.vocabapp.model.DifferentLang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DifferentLangRepository extends JpaRepository<DifferentLang, Long> {




    Optional<DifferentLang> findByWordIgnoreCase(String word);

    Optional<DifferentLang> findByWordAndLanguage_LangId(String word, Integer langId);


}





