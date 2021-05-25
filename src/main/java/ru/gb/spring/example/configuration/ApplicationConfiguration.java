package ru.gb.spring.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Класс конфигурации.
 * Позволяет настроить сканирование проекта через аннотацию @ComponentScan
 * Добавлять элементы в контекст по средствам аннотации @Bean
 */
@Configuration
@ComponentScan("ru.gb.spring.example")
public class ApplicationConfiguration {
}
