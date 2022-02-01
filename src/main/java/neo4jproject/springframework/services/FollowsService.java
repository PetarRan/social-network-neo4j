package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.Follows;
import neo4jproject.springframework.domain.User;

import java.util.List;

public interface FollowsService {
    List<Follows> listAll();
}
