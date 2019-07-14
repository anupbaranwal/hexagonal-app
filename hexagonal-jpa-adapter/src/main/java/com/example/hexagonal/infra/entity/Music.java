package com.example.hexagonal.infra.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_MUSIC")
@Entity
@Data
public class Music {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "LYRICS")
    private String lyrics;

    @Column(name = "AUTHOR_NAME")
    private String authorName;

    @Column(name = "RATING")
    private int rating;

}

