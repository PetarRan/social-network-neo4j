package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Liked;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface LikedRepository extends Neo4jRepository<Liked, Long> {
    @Query("MATCH\n" +
            "(a:User),\n" +
            "(b:Post)\n" +
            "WHERE a.email = $user1 AND b.description = $description\n" +
            "MERGE (a)-[r:Liked]->(b)\n" +
            "RETURN type(r)")
    void addLiked(@Param("user1")String email1, @Param("description") String description);
}
