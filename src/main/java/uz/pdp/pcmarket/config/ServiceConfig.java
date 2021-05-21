package uz.pdp.pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ServiceConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("OPERATOR").password(passwordEncoder().encode("operator")).roles("OPERATOR")
                .and()
                .withUser("MODERATOR").password(passwordEncoder().encode("moderator")).roles("MODERATOR")
                .and()
                .withUser("SUPER_ADMIN").password(passwordEncoder().encode("admin")).roles("SUPER_ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/Order/**").hasAnyRole("OPERATOR", "SUPER_ADMIN")
                .antMatchers(HttpMethod.POST, "/api/Product").hasAnyRole("MODERATOR", "SUPER_ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/Product/*").hasAnyRole("MODERATOR", "SUPER_ADMIN")
                .antMatchers("/api/**").hasRole("SUPER_ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
