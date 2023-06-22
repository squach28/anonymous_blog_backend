package com.squach.anonymous_blog.exception;

public class BlogPostNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1;

    public BlogPostNotFoundException(String message) {
        super(message);
    }
}
