package com.example.hexagonal.infra.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Table(name = "T_MUSIC")
@Entity
@Data
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LYRICS")
    private String lyrics;

    @Column(name = "AUTHOR_NAME")
    private String authorName;

    @Column(name = "RATING")
    private int rating;

}

