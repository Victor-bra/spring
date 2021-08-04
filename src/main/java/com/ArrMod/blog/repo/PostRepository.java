package com.ArrMod.blog.repo;

import com.ArrMod.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {



}
