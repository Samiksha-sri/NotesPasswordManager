package com.example.NotesPasswordManager.NotesPasswordManager.repository;

import com.example.NotesPasswordManager.NotesPasswordManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
