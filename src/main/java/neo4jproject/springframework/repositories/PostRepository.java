package neo4jproject.springframework.repositories;

import neo4jproject.springframework.domain.Post;
import neo4jproject.springframework.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface PostRepository extends Neo4jRepository<Post, Long> {
    @Query("CREATE(Post:Post {description: $description, likes: $likes, latitude:$latitude, longitude:$longitude})")
    void addPost(@Param("description") String description,
                 @Param("likes")Long likes,
                 @Param("latitude")Double latitude, @Param("longitude")Double longitude);

    @Query("MATCH (n:Firma)\n" +
            "WHERE id(n) = $id\n" +
            "SET n={likes: $likes} \n")
    void likePost(@Param("id") Long id, @Param("likes")Long likes);

    @Query("MATCH (n:User) return n")
    Collection<Post> getAllPosts();
}
