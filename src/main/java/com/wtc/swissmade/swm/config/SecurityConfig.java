package com.wtc.swissmade.swm.config;

import com.wtc.swissmade.swm.repositories.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .permitAll()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/", true).and().exceptionHandling()
                .and().logout()    //logout configuration
                .logoutUrl("/app-logout")
                .logoutSuccessUrl("/login")
                .and().exceptionHandling().accessDeniedPage("/access-denied");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
            .ignoring()
            .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**","/templates/**", "/webjars/**", "assets");
    }
}
