package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.Post;
import neo4jproject.springframework.domain.User;

import java.util.List;

public interface PostService {
    List<Post> listAll();
}
