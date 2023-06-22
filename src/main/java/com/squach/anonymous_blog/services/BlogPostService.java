package com.squach.anonymous_blog.services;

import com.squach.anonymous_blog.exception.BlogPostNotFoundException;
import com.squach.anonymous_blog.models.BlogPost;
import com.squach.anonymous_blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    public BlogPost getBlogPostById(Long id) {
        return blogPostRepository.findById(id)
                .orElseThrow(() -> new BlogPostNotFoundException("Blog Post with ID " + id + " was not found"));
    }

    public BlogPost addPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}
