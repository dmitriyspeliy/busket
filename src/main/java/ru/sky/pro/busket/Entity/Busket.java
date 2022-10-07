package ru.sky.pro.busket.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;


@Data
@Configuration
public class Busket {
    private HashSet<Item> unicList;

    public Busket(){
        unicList = new HashSet<>();
    }

    @Bean
    @SessionScope
    public Busket sessionScopedBean(){
        return new Busket();
    }
}
