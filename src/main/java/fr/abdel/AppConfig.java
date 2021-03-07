package fr.abdel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"fr.abdel.controller", "fr.abdel.repository.file", "fr.abdel.service"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
