package neo4jproject.springframework.repositories;


import neo4jproject.springframework.domain.Follows;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface FollowsRepository extends Neo4jRepository<Follows, Long> {
    @Query("MATCH\n" +
            "(a:User),\n" +
            "(b:User)\n" +
            "WHERE a.id = $userid1 AND b.id = $userid2\n" +
            "CREATE (a)-[r:Follows {}]->(b)\n" +
            "RETURN type(r)")
    void addFollows(@Param("userid1")Long id1, @Param("userid2") Long id2);

}
