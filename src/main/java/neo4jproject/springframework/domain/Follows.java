package neo4jproject.springframework.domain;

import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties()
public class Follows {
    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private User user;

    public Follows(User user) {
        this.id = null;
        this.user = user;
    }

    public Follows withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            return new Follows(this.user);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
