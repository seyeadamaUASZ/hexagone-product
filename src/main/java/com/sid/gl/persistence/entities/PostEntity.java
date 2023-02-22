package com.sid.gl.persistence.entities;

import com.sid.gl.domain.Post;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tb_post")
@Data
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title_post;
    private String description;
    private Date datePublish = new Date();
}
