package neo4jproject.springframework.services;

import neo4jproject.springframework.domain.Liked;
import neo4jproject.springframework.repositories.LikedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikedServiceImpl implements LikedService {
    LikedRepository likedRepository;

    public LikedServiceImpl(LikedRepository likedRepository) {
        this.likedRepository = likedRepository;
    }

    @Override
    public List<Liked> listAll() {
        return null;
    }
}
