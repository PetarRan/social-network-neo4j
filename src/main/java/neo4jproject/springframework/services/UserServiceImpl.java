package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.User;
import neo4jproject.springframework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository productRepository;

    public UserServiceImpl(UserRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<User> listAll() {
        List<User> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public User getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public User saveOrUpdate(User product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Collection<User> getAll() {
        return null;
    }

}
