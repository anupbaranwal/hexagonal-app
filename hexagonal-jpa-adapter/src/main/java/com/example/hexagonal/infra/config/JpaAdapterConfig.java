package com.example.hexagonal.infra.config;

import com.example.hexagonal.domain.port.MusicRepository;
import com.example.hexagonal.infra.RealtimeMusicRepository;
import com.example.hexagonal.infra.dao.MusicDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaAdapterConfig {
    @Bean
    public MusicRepository realtimeMusicRepository(MusicDao musicDao) {
        return new RealtimeMusicRepository(musicDao);
    }
}
