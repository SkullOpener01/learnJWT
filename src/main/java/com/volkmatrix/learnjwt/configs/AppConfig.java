package com.volkmatrix.learnjwt.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails user =
        User.builder().username("pankaj").password(passwordEncoder().encode("pankaj")).roles("ADMIN").build();
    UserDetails user1 =
        User.builder().username("monu").password(passwordEncoder().encode("monu")).roles("ADMIN").build();
    UserDetails user2 =
        User.builder().username("rachit").password(passwordEncoder().encode("rachit")).roles("ADMIN").build();
    UserDetails user3 =
        User.builder().username("sumeet").password(passwordEncoder().encode("sumeet")).roles("ADMIN").build();

    return new InMemoryUserDetailsManager(user, user1, user2, user3);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    return passwordEncoder;
  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
    return builder.getAuthenticationManager();
  }
}
