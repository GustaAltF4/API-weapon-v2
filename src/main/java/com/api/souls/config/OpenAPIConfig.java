package com.api.souls.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "ArmoryAPI(demo)",
                version = "1.0.0",
                description = "API para consultar armas de videojuegos"
        )
)
public class OpenAPIConfig {


}

