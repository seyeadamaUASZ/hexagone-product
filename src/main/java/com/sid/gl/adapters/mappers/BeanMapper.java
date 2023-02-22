package com.sid.gl.adapters.mappers;


import com.sid.gl.domain.Comment;
import com.sid.gl.domain.Post;
import com.sid.gl.persistence.entities.CommentEntity;
import com.sid.gl.persistence.entities.PostEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanMapper {

    public static PostEntity convertPostEntity(PostRecord postRecord){
        PostEntity post = new PostEntity();
        BeanUtils.copyProperties(postRecord,post);
        return post;
    }

    public static PostRecord convertPostRecord(PostEntity postEntity){
        return new PostRecord(postEntity.getTitle_post(), postEntity.getDescription());

    }

    public static CommentEntity convertCommentEntity(CommentRecord commentRecord){
        CommentEntity comment=new CommentEntity();
        BeanUtils.copyProperties(commentRecord,comment);
        return comment;
    }

    public static CommentRecord convertCommentRecord(CommentEntity comment){
        return  new CommentRecord(comment.getComment());
    }

    public static Post convertPost(PostRecord postRecord){
        Post post = new Post();
        post.setTitle_post(postRecord.title_post());
        post.setDescription(postRecord.description());
        return post;
    }

    public static Comment convertComment(CommentRecord commentRecord){
        Comment comment = new Comment();
        comment.setComment(commentRecord.comment());
        return comment;
    }

    public static List<Post> convertListPost(List<PostRecord> postRecords){
        return postRecords
                .stream()
                .map(record->convertPost(record))
                .collect(Collectors.toList());
    }

    public static List<Comment> convertListComment(List<CommentRecord> commentRecords){
        return commentRecords
                .stream()
                .map(record->convertComment(record))
                .collect(Collectors.toList());
    }
}
