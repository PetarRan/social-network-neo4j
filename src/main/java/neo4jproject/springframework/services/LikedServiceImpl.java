package neo4jproject.springframework.services;

import neo4jproject.springframework.repositories.LikedRepository;
import org.springframework.stereotype.Service;

@Service
public class LikedServiceImpl {
    LikedRepository likedRepository;

    public LikedServiceImpl(LikedRepository likedRepository) {
        this.likedRepository = likedRepository;
    }
}
