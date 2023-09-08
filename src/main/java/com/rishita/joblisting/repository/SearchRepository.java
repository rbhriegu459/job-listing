package com.rishita.joblisting.repository;

import java.util.List;

import com.rishita.joblisting.model.Post;

public interface SearchRepository {
	
	List<Post> findByText(String text);
}
