package com.demo.vocabapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class DifferentLang {
    @Id
    private Long id;
    private String word;
    private String meaning;
    @ManyToOne
    @JoinColumn(name="langid")
    private Language language;
}
