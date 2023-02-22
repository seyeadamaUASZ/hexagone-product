package com.sid.gl.domain.service.Impl;

import com.sid.gl.adapters.mappers.PostRecord;
import com.sid.gl.domain.Post;
import com.sid.gl.domain.service.BlogService;
import com.sid.gl.domain.service.ICommentPort;
import com.sid.gl.domain.service.IPostPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BlogServiceImpl implements BlogService {
      private final ICommentPort iCommentPort;
      private final IPostPort iPostPort;

    @Override
    public Post addPost(PostRecord postRecord) {
        return iPostPort.addPost(postRecord);
    }

    @Override
    public List<Post> listAllPosts() {
        return iPostPort.listPost();
    }

    @Override
    public Post getOnePost(Long id) {
        return null;
    }
}
