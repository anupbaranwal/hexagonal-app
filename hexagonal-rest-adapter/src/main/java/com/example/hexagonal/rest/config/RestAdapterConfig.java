package com.example.hexagonal.rest.config;

import com.example.hexagonal.domain.MusicReaderService;
import com.example.hexagonal.domain.port.MusicReader;
import com.example.hexagonal.domain.port.MusicRepository;
import org.springframework.context.annotation.Bean;

public class RestAdapterConfig {

  @Bean
  public MusicReader getMusicReader(MusicRepository musicRepository) {
    return new MusicReaderService(musicRepository);
  }
}