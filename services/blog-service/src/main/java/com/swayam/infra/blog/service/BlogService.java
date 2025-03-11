package com.swayam.infra.blog.service;

import com.swayam.infra.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BlogService {
    List<Blog> getAllBlogs();
    Blog getBlogById(String blogId);
    Blog createBlog(Blog blog);
    Blog updateBlog(String blogId, Blog blog);
    void deleteBlog(String blogId);
}
