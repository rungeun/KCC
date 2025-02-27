package com.example.KCC.entity;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
@Table(name = "`user`") // MySQL 'user' 테이블과 매핑. 예약어이므로 백틱(`) 권장
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

    public Article(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

