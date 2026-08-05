package com.ozgurcanozel.main;

import com.ozgurcanozel.config.AppConfig;
import com.ozgurcanozel.model.User;
import com.ozgurcanozel.service.LogInService;
import com.ozgurcanozel.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // olusan contexin icinde erismek icin yazdik : icinde configuration anotasyonu bulunan class name
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }
        LogInService logInService = new LogInService();
        logInService.LogIn();
    }
}
