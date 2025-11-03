package com.demo.vocabapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



    @Entity
    @Table
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class Language {
        @Id
        //@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int langId;
        private String langType;
        @OneToMany (mappedBy = "language",cascade= CascadeType.ALL)//cascde all is used when we remove the student data then in address table data will be removed
        //many address
        private List<DifferentLang> words =new ArrayList<>();//this line create another table with  column sid and addressid
        //but by using mapped by student -studentid (fk) is generated in the address table


}
