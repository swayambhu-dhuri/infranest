package com.swayam.infra.blog.service.impl;

import com.swayam.infra.blog.model.Blog;
import com.swayam.infra.blog.repository.BlogRepo;
import com.swayam.infra.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    private BlogRepo blogRepo;

    @Autowired
    public BlogServiceImpl(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }

    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    public Blog getBlogById(String blogId) {
        return blogRepo.findById(blogId).orElseThrow(() -> new RuntimeException("Blog not found"));
    }

    @Override
    public Blog createBlog(Blog blog) {
        return blogRepo.save(blog);
    }


    public Blog updateBlog(String blogId, Blog updatedBlog) {
        Optional<Blog> blogInDb = blogRepo.findById(blogId);
        if(!blogInDb.isPresent()){
            throw new RuntimeException("Blog not found");
        }
        Blog blog = blogInDb.get();
        blog.setTitle(updatedBlog.getTitle());
        blog.setContent(updatedBlog.getContent());
        blog.setAuthorId(updatedBlog.getAuthorId());

        return blogRepo.save(blog);
    }

    public void deleteBlog(String blogId) {
        blogRepo.deleteById(blogId);
    }
}
