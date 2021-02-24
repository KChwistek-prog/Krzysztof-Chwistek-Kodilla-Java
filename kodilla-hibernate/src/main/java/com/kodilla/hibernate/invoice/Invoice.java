package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Invoice {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID")
    private int id;

    @NotNull
    @Column(name = "NUMBER")
    private String number;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Item.class)
    @JoinColumn(name = "ITEMS")
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }


    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
