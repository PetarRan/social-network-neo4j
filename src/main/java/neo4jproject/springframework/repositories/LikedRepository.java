package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Liked;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LikedRepository extends Neo4jRepository<Liked, Long> {
}
