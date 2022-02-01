package neo4jproject.springframework.services;

import neo4jproject.springframework.repositories.PostedRepository;
import org.springframework.stereotype.Service;

@Service
public class PostedServiceImpl {
    PostedRepository postedRepository;

    public PostedServiceImpl(PostedRepository postedRepository) {
        this.postedRepository = postedRepository;
    }
}
