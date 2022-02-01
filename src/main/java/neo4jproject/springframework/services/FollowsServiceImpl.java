package neo4jproject.springframework.services;

import neo4jproject.springframework.repositories.FollowsRepository;
import org.springframework.stereotype.Service;

@Service
public class FollowsServiceImpl {
    private FollowsRepository followsRepository;

    public FollowsServiceImpl(FollowsRepository followsRepository) {
        this.followsRepository = followsRepository;
    }
}
