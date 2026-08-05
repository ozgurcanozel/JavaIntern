package com.ozgurcanozel.service;

import com.ozgurcanozel.config.AppConfig;
import com.ozgurcanozel.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LogInService {

    public void LogIn(){

        // user listesine ihtiyacim var, zaten doldurup contexe koyduk

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService =  context.getBean(UserService.class);
    }
}
