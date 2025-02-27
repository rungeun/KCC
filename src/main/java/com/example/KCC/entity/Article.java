package com.example.KCC.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
public class Article {
    @Id
    @GeneratedValue
    private long id;
    @Getter
    @Column
    private String email;
    @Getter
    @Column
    private String password;

}

