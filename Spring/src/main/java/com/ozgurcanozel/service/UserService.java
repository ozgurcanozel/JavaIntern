package com.ozgurcanozel.service;

import com.ozgurcanozel.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserService {

    private List<User> userList;
}
