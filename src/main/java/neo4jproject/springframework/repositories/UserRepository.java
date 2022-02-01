package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Collection;


public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (n:User) return n")
    Collection<User> getAllUsers();

    @Query("CREATE(User:User {email: $email, birthday: $birthday, imageUrl: $imageUrl, firstName:$firstName, lastName:$lastName, phoneNumber:$phoneNumber, isTravelling:$isTravelling})")
    void addUser(@Param("email") String email, @Param("birthday") LocalDateTime birthday, @Param("imageUrl")String imageUrl,
                 @Param("firstName") String firstName, @Param("lastName") String lastName,
                 @Param("phoneNumber") String phoneNumber,
                 @Param("isTravelling")Boolean isTravelling);

    @Query("CREATE(User:User {email: $email, imageUrl: $imageUrl, firstName:$firstName, lastName:$lastName})")
    void addUserStart(@Param("email") String email, @Param("imageUrl")String imageUrl,
                 @Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("MATCH (n:User)\n" +
            "WHERE id(n) = $id\n" +
            "DETACH DELETE n")
    void deleteUser(@Param("id") Long id);

    @Query("MATCH (n:Firma)\n" +
            "WHERE id(n) = $id\n" +
            "SET n={phoneNumber: $phoneNumber, imageUrl: $imageUrl} \n")
    void updateFirma(@Param("id") Long id, @Param("phoneNumber") String phoneNumber, @Param("imageUrl")String imageUrl);

    @Query("MATCH (n:User) DETACH DELETE n")
    void deleteAllFirma();

}
