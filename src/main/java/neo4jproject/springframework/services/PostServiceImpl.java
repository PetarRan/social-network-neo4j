package neo4jproject.springframework.services;

import neo4jproject.springframework.repositories.PostRepository;
import neo4jproject.springframework.repositories.PostedRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements  PostService{
    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
