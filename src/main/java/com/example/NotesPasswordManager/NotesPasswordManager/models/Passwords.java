package com.example.NotesPasswordManager.NotesPasswordManager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "passwords")
public class Passwords extends BaseModel{

    private String title;
    private String password;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
