package com.example.hexagonal.rest;

import com.example.hexagonal.domain.model.MusicDto;
import com.example.hexagonal.domain.port.MusicReader;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/musics")
@Slf4j
public class MusicResource {

  @Autowired
  private MusicReader musicReader;

  @GetMapping
  public ResponseEntity<List<MusicDto>> getMusics() {
    return ResponseEntity.ok(musicReader.readMusic());
  }
}
