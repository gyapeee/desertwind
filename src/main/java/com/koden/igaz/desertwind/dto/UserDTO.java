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

    public String getAktualisJelenetName() {
        return aktualisJelenetName;
    }

    public void setAktualisJelenetName(String aktualisJelenetName) {
        this.aktualisJelenetName = aktualisJelenetName;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public Map<String, Integer> getJelenetVerziok() {
        return jelenetVerziok;
    }

    public void setJelenetVerziok(Map<String, Integer> jelenetVerziok) {
        this.jelenetVerziok = jelenetVerziok;
    }
}
