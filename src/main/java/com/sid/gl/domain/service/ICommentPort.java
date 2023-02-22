package com.sid.gl.domain.service;

import com.sid.gl.domain.Comment;

import java.util.List;

public interface ICommentPort {
    List<Comment> listComments();
    Comment addComment(Comment comment);
}
