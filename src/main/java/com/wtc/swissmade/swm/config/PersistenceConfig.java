package com.wtc.swissmade.swm.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;

@EnableJpaRepositories(basePackages = "com.liquor.store.onliqst.repositories")
public class PersistenceConfig {

}
