package com.example.hexagonal.infra.config;

import com.example.hexagonal.domain.port.MusicRepository;
import com.example.hexagonal.infra.RealTimeMusicRepository;
import com.example.hexagonal.infra.dao.MusicDao;
import org.springframework.context.annotation.Bean;

public class JpaAdapterConfig {
    @Bean
    public MusicRepository realTimeMusicRepository(MusicDao musicDao) {
        return new RealTimeMusicRepository(musicDao);
    }
}
