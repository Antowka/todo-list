package ru.antowka.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by anton on 04.05.16.
 */
public class Task {

    @Id
    private int taskId;

    private String name;

    private User user;


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
