package com.example.hexagonal.config;

import com.example.hexagonal.infra.config.HardcodedAdapterConfig;
import com.example.hexagonal.rest.config.RestAdapterConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({RestAdapterConfig.class, JpaAdapterConfig.class})
@Import({RestAdapterConfig.class, HardcodedAdapterConfig.class})
public class BootstrapConfig {}
