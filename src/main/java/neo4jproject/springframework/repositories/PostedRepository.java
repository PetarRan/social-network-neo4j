package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Posted;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PostedRepository extends Neo4jRepository<Posted, Long> {
}
