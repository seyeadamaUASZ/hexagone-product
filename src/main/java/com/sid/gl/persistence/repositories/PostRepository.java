package com.sid.gl.persistence.repositories;

import com.sid.gl.persistence.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
