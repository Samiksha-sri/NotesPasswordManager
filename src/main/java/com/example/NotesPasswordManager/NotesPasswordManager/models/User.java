package com.example.NotesPasswordManager.NotesPasswordManager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends BaseModel{

    private String name;
    private String password;
    private String emailId;
    @OneToMany(mappedBy = "user")
    private List<Notes> notes;
    @OneToMany(mappedBy = "user")
    private List<Passwords> passwords;
}
