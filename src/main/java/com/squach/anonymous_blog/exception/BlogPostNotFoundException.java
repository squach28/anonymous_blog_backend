package com.squach.anonymous_blog.exception;

public class BlogPostNotFoundException extends RuntimeException{

    public BlogPostNotFoundException(String message) {
        super(message);
    }
}
