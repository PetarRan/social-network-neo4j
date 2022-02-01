package neo4jproject.springframework.repositories;


import neo4jproject.springframework.domain.Follows;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface FollowsRepository extends Neo4jRepository<Follows, Long> {
    @Query("MATCH\n" +
            "(a:Vlasnik),\n" +
            "(b:PoslovniProstor)\n" +
            "WHERE a.jmbg = $jmbg AND b.adresa = $adresa\n" +
            "CREATE (a)-[r:Poseduje {datum_kupovine: $datum_kupovine}]->(b)\n" +
            "RETURN type(r)")
    void addFollows(@Param("datum_kupovine") String datum_kupovine, @Param("jmbg") Long jmbg, @Param("adresa") String adresa);

    @Query("MATCH (v:Vlasnik)-[p:Poseduje]->(o:PoslovniProstor)\n" +
            "WHERE id(v) = $idVlasnika AND id(o) = $idPoslovnogProstora\n" +
            "SET p={datum_kupovine: $datum_kupovine}\n" +
            "RETURN p")
    void updateFollows(@Param("datum_kupovine") String datum_kupovine, @Param("idVlasnika") Long idVlasnika, @Param("idPoslovnogProstora") Long idPoslovnogProstora);
}
