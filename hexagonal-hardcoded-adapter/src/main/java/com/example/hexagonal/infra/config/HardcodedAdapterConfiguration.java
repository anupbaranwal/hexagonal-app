package com.example.hexagonal.infra.config;

import com.example.hexagonal.domain.port.MusicRepository;
import com.example.hexagonal.infra.HardcodedMusicRepository;
import org.springframework.context.annotation.Bean;

public class HardcodedAdapterConfiguration {
    @Bean
    public MusicRepository hardCodedMusicRepository() {
        return new HardcodedMusicRepository();
    }
}