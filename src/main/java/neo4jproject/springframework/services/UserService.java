package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.User;

import java.util.Collection;
import java.util.List;


public interface UserService {

    List<User> listAll();

    User getById(Long id);

    User saveOrUpdate(User product);

    void addUser(User user);

    void delete(Long id);

    Collection<User> getAll();
    Collection<User> getByEmail(String email);

    void updateUser(User user);
}
