//package com.fen.config;
//
//import com.fen.service.UserService;
//import com.fen.service.impl.UserDetailsServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.SecurityBuilder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.List;
//
//@Order(1)
//@Configuration
////@EnableWebSecurity
////public class SecurityConfig extends WebSecurityConfigurerA {
//public class SecurityConfig {
//    private final UserDetailsServiceImpl userDetailsService;
//
//    public SecurityConfig(UserDetailsServiceImpl userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    //用户认证
//    @Bean(name = "userDetailsService")
//    UserDetailsService getUserService() {
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
//                return new User("admin", new BCryptPasswordEncoder().encode("123"), auths);
//            }
//        };
//
//    }
//
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .requestMatchers("/v1/user/**").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin(
//                        form -> form
//                                .loginProcessingUrl("/login").permitAll()
//                                .successHandler(new MyAuthenticationSuccessHandler())
//                                .failureHandler(new MyAuthenticationFailureHandler())
//                )
//                .csrf(
//                        AbstractHttpConfigurer::disable
//                )
//        ;
//        return http.build();
//    }
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
