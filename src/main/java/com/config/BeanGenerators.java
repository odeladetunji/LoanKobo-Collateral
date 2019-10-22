package com.config;

import com.entity.Collateral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerators {

    @Bean
    public Collateral aCollateral(){
        return new Collateral();
    }
}
