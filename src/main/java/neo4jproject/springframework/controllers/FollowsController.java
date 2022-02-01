package neo4jproject.springframework.controllers;

import neo4jproject.springframework.services.FollowsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/neo4j/follows")
public class FollowsController {
    private final FollowsService followsService;
    public FollowsController(FollowsService followsService){
        this.followsService = followsService;
    }


}
