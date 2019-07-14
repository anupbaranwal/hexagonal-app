package com.example.hexagonal.config;

import com.example.hexagonal.infra.config.JpaAdapterConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JpaAdapterConfig.class)
public class BootstrapConfig {
}
