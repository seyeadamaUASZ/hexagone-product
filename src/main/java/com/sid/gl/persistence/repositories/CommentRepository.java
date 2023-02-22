package com.sid.gl.persistence.repositories;

import com.sid.gl.persistence.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
}
