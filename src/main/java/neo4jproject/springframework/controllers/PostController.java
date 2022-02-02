package neo4jproject.springframework.controllers;

import neo4jproject.springframework.domain.Post;
import neo4jproject.springframework.domain.User;
import neo4jproject.springframework.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/rest/neo4j/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(
            value = "/getAll"
    )
    public Collection<Post> getAll() {
        return postService.getAllPosts();
    }

    @PostMapping(
            value = "/addPost",
            produces = {"application/json"}
    )
    public HttpStatus addUser(@RequestBody(required = true) Post post) {
        try {
            postService.addPost(post);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

    @GetMapping(
            value = "/getFollowersPosts/{mail}"
    )
    public Collection<Post> findAllMyFollowers(@PathVariable("mail")String email) {
        return postService.getMyFollowersPosts(email);
    }



}
