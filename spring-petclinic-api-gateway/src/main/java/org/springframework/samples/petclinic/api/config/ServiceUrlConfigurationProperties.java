package org.springframework.samples.petclinic.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "services.url")
@Data
public class ServiceUrlConfigurationProperties {

    private String vets;
    private String visits;
    private String customers;
}
