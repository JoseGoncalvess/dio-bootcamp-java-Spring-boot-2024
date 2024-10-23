package com.StudyAPI.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig  {

    // TODO Este método define a configuração de segurança da aplicação.
    // TODO Exemplo:
    ///auth/login: Qualquer um pode acessar sem autenticação.
    //
    ///admin/info: Apenas usuários com papel ADMIN podem acessar.
    //
    ///user/info: Apenas usuários com papel USER podem acessar.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/users").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/users/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());  // Usando autenticação básica HTTP

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user").password("{noop}123").roles("USER").build());
        manager.createUser(User.withUsername("admin").password("{noop}admin").roles("ADMIN").build());
        return manager;
    }
// csrf(csrf -> csrf.disable()): Desabilita a proteção contra CSRF, útil para APIs REST que não usam sessões.
//
//authorizeHttpRequests(authz -> authz): Configura as autorizações HTTP para várias rotas.
//
//requestMatchers("/auth/login").permitAll(): Permite acesso ao endpoint /auth/login sem autenticação.
//
//requestMatchers("/admin/**").hasRole("ADMIN"): Restringe acesso a qualquer endpoint sob /admin/** para usuários com papel ADMIN.
//
//requestMatchers("/user/**").hasRole("USER"): Restringe acesso a qualquer endpoint sob /user/** para usuários com papel USER.
//
//anyRequest().authenticated(): Exige autenticação para todas as outras requisições.
//
//sessionCreationPolicy(SessionCreationPolicy.STATELESS): Configura a política de criação de sessão como STATELESS, significando que o servidor não manterá a sessão do usuário, apropriado para APIs REST.
//
//httpBasic(): Habilita a autenticação básica HTTP.
}