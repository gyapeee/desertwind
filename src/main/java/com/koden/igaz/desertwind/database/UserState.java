package com.koden.igaz.desertwind.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "USERSTATE")
public class UserState {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    public UserState() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserState{" +
                "id=" + id +
                ", userId=" + userId +
                '}';
    }
}
