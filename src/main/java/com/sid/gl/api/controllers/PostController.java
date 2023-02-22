package com.sid.gl.api.controllers;

import com.sid.gl.adapters.mappers.PostRecord;
import com.sid.gl.domain.Post;
import com.sid.gl.domain.service.BlogService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/post")
@RequiredArgsConstructor
public class PostController {
    private final BlogService blogService;

    @GetMapping
    public ResponseEntity<?> allPosts(){
        return ResponseEntity.ok(blogService.listAllPosts());
    }

    @PostMapping
    public ResponseEntity<?> savePost(@Valid @RequestBody PostRecord postRecord){
        return ResponseEntity.ok(blogService.addPost(postRecord));
    }


}
