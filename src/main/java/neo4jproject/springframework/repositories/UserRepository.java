package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;


public interface UserRepository extends Neo4jRepository<User, Long> {
}
