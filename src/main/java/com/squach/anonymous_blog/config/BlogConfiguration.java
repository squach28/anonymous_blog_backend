package com.squach.anonymous_blog.config;

import com.squach.anonymous_blog.models.BlogPost;
import com.squach.anonymous_blog.repository.BlogPostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class BlogConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(BlogPostRepository blogPostRepository) {
        return args -> {
            blogPostRepository.save(new BlogPost(1L, "anon", LocalDateTime.now(), "i like turtles"));
            blogPostRepository.save(new BlogPost(2L, "anon", LocalDateTime.now(), "i like seashells"));
        };
    }
}
