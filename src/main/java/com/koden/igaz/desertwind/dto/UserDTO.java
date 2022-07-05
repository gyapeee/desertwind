package com.koden.igaz.desertwind.dto;

import java.util.List;
import java.util.Map;

public class UserDTO {

    public String aktualisJelenetName;

    public List<String> inventory;

    public Map<String, Integer> jelenetVerziok;
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
