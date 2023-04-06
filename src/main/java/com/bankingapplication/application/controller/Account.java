package com.bankingapplication.application.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.lang.model.element.Name;

@Setter
@Getter
@ToString
@Entity
@Table(name ="Account", schema = "public")
public class Account {

    @Id
    @Column
    private long id_number;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email_address;
    @Column
    private int phone_number;
    @Column
    private int account_number;


    public void add(Account account) {
    }
}
