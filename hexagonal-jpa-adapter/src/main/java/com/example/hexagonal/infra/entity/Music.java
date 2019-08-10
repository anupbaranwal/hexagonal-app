package com.example.hexagonal.infra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

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

  @Column(name = "ARTIST_NAME")
  private String artist;

  @Column(name = "RATING")
  private int rating;

}

