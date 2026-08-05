package com.ozgurcanozel.config;

import com.ozgurcanozel.model.User;
import com.ozgurcanozel.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

@Configuration // bu bir ezber bu sinif oldugnu anlamasi icin
public class AppConfig {


    @Bean // Beanini olusturmak icin bu anotasyonu yazdik
    public UserService userService(){ // ve artik void degil ne donmesini istiyorsak onu yazmamiz gerekir
        UserService userService = new UserService();

        List<User> userList = new ArrayList<>();

        userList.add(new User("Ozgurcan"));
        userList.add(new User("Derya"));

        userService.setUserList(userList);

        return userService;
    }
}
