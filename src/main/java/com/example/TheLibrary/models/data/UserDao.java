package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Accounts.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
}
