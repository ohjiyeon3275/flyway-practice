package com.jiyeon.project.repository;

import com.jiyeon.project.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
