package com.adastra.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Stanislav Nemirovsky
 */
@ConfigurationProperties
public class NameProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}