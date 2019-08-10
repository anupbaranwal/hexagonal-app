package com.example.hexagonal.rest;

import com.example.hexagonal.domain.MusicReaderService;
import com.example.hexagonal.domain.port.MusicReader;
import com.example.hexagonal.domain.port.MusicRepository;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusicResourceApplication {

  public static void main(String[] args) {
    SpringApplication.run(MusicResourceApplication.class, args);
  }

  @TestConfiguration
  public class RestTestConfiguration {

    @Bean
    public MusicReader getMusicReader(MusicRepository musicRepository) {
      return new MusicReaderService(musicRepository);
    }

    @Bean
    public MusicRepository getMusicRepository() {
      return Mockito.mock(MusicRepository.class);
    }
  }
}
