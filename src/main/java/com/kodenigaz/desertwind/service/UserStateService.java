package com.kodenigaz.desertwind.service;

import com.kodenigaz.desertwind.database.UserState;
import com.kodenigaz.desertwind.database.UserStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStateService {

    @Autowired
    private UserStateRepository userStateRepository;

    public List<UserState> list() {
        return userStateRepository.findAll();
    }
}
