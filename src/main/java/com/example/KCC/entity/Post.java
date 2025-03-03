package com.example.KCC.entity;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
@Table(name = "`post`")
public class Post {
    @Id
    @GeneratedValue
    private Long post_id;
    @Getter
    @Column
    private String title;
    @Getter
    @Column
    private String content;
}

