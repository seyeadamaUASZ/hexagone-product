package com.sid.gl.persistence.entities;

import com.sid.gl.domain.Comment;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tb_comment")
@Data
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private Date dateComment=new Date();
    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;
}
