package com.kodilla.hibernate.tasklist;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String descritpion;

    public TaskList() {
    }

    public TaskList(String listName, String descritpion) {
        this.listName = listName;
        this.descritpion = descritpion;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    public void setListName(String lastName) {
        this.listName = lastName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        descritpion = descritpion;
    }
}
