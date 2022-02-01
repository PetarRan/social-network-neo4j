package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Post;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PostRepository extends Neo4jRepository<Post, Long> {
}
