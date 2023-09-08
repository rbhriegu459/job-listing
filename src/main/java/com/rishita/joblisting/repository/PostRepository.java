package com.rishita.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rishita.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	
}
