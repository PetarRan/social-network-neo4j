package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.Follows;
import neo4jproject.springframework.repositories.FollowsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowsServiceImpl implements FollowsService {
    private FollowsRepository followsRepository;

    public FollowsServiceImpl(FollowsRepository followsRepository) {
        this.followsRepository = followsRepository;
    }

    @Override
    public List<Follows> listAll() {
        return null;
    }
}
