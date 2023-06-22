package com.squach.anonymous_blog.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="blog_post")
public class BlogPost {
    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private LocalDateTime publishedOn;
    private String content;
}
