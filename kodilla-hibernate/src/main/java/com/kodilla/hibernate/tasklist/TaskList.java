package com.kodilla.hibernate.tasklist;
import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class TaskList {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "LISTNAME")
    private String listName;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(
            targetEntity = Task.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    public TaskList(){
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }


    public int getId() {
        return id;
    }


    public String getListName() {
        return listName;
    }


    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }


    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}