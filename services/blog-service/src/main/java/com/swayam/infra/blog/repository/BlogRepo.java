package com.swayam.infra.blog.repository;

import com.swayam.infra.blog.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String> {
}
