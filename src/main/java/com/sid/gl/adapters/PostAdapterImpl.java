package com.sid.gl.adapters;

import com.sid.gl.adapters.mappers.BeanMapper;
import com.sid.gl.adapters.mappers.PostRecord;
import com.sid.gl.domain.Comment;
import com.sid.gl.domain.Post;
import com.sid.gl.domain.service.ICommentPort;
import com.sid.gl.domain.service.IPostPort;
import com.sid.gl.persistence.entities.PostEntity;
import com.sid.gl.persistence.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostAdapterImpl implements IPostPort, ICommentPort {
    private final PostRepository postRepository;

    @Override
    public List<Post> listPost() {
      List<PostRecord> postRecords =  postRepository.findAll()
                .stream()
                .map(BeanMapper::convertPostRecord)
                .collect(Collectors.toList());
        return BeanMapper.convertListPost(postRecords);
    }

    @Override
    public Post addPost(PostRecord postRecord) {
        PostEntity postEntity = BeanMapper.convertPostEntity(postRecord);
        postRepository.save(postEntity);
        return BeanMapper.convertPost(postRecord);
    }

    @Override
    public List<Comment> listComments() {
        return null;
    }

    @Override
    public Comment addComment(Comment comment) {
        return null;
    }
}
