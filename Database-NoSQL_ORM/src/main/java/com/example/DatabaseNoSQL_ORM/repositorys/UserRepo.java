package com.example.DatabaseNoSQL_ORM.repositorys;

import com.example.DatabaseNoSQL_ORM.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {



}
