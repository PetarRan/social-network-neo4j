package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Posted;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface PostedRepository extends Neo4jRepository<Posted, Long> {
    @Query("MATCH\n" +
            "(a:User),\n" +
            "(b:Post)\n" +
            "WHERE a.id = $id AND b.userid = $userid\n" +
            "CREATE (a)-[r:Posted {}]->(b)\n" +
            "RETURN type(r)")
    void addPosted(@Param("id")Long id, @Param("userid") Long userid);

    @Query("MATCH (a:User)-[p:Posted]->(b:Post)\n" +
            "WHERE id(a) = $id AND id(b) = $userid\n" +
            "SET p={}\n" +
            "RETURN p")
    void updatePosted(@Param("id")Long id, @Param("userid") Long userid);
}
