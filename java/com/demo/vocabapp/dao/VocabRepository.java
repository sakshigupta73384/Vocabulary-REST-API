
package com.demo.vocabapp.dao;

import com.demo.vocabapp.model.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VocabRepository extends JpaRepository<Vocabulary, Integer> {
    Optional<Vocabulary> findByWord(String word);
}
