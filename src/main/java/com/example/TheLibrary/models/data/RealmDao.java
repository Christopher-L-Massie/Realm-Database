package com.example.TheLibrary.models.data;

import com.example.TheLibrary.models.Realm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealmDao extends CrudRepository<Realm, Integer> {
}
