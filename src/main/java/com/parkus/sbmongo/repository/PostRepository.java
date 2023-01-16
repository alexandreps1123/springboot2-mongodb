package com.parkus.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.parkus.sbmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
    
}
