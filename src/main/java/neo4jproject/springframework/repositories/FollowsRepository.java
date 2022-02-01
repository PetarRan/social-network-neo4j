package neo4jproject.springframework.repositories;


import neo4jproject.springframework.domain.Follows;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FollowsRepository extends Neo4jRepository<Follows, Long> {
}
