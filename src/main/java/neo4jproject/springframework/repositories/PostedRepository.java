package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Posted;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface PostedRepository extends Neo4jRepository<Posted, Long> {
    @Query("MATCH\n" +
            "(a:User),\n" +
            "(b:Post)\n" +
            "WHERE a.email = $userid AND b.userid = $userid\n" +
            "MERGE (a)-[r:Posted]->(b)\n" +
            "RETURN type(r)")
    void addPosted(@Param("userid") String userid);

    @Query("MATCH (a:User{email = $userid})-[p:Posted]->(b:Post) return p, a, b")
    void getPostedLinks(@Param("userid") String userid);
}
