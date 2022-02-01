package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Posted;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface PostedRepository extends Neo4jRepository<Posted, Long> {
    @Query("MATCH\n" +
            "(a:User),\n" +
            "(b:Post)\n" +
            "WHERE a.id = $id AND b.adresa = $adresa\n" +
            "CREATE (a)-[r:Poseduje {datum_kupovine: $datum_kupovine}]->(b)\n" +
            "RETURN type(r)")
    void addPosted(@Param("id")Long id, @Param("userid") Long userid, @Param("adresa") String adresa);

    @Query("MATCH (v:Vlasnik)-[p:Poseduje]->(o:PoslovniProstor)\n" +
            "WHERE id(v) = $idVlasnika AND id(o) = $idPoslovnogProstora\n" +
            "SET p={datum_kupovine: $datum_kupovine}\n" +
            "RETURN p")
    void updatePosted(@Param("datum_kupovine") String datum_kupovine, @Param("idVlasnika") Long idVlasnika, @Param("idPoslovnogProstora") Long idPoslovnogProstora);
}
