package com.sid.gl.domain.service;

import com.sid.gl.adapters.mappers.PostRecord;
import com.sid.gl.domain.Post;

import java.util.List;

public interface BlogService {
    Post addPost(PostRecord postRecord);
    List<Post> listAllPosts();
    Post getOnePost(Long id);

}
