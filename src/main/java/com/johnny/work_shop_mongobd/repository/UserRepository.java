package com.johnny.work_shop_mongobd.repository;

import com.johnny.work_shop_mongobd.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {
}
