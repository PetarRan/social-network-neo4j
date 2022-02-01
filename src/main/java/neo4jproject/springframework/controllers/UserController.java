package neo4jproject.springframework.controllers;

import neo4jproject.springframework.domain.User;
import neo4jproject.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/rest/neo4j/user")
public class UserController {
    private final UserService userService;


    public UserController(UserService productService) {
        this.userService = productService;
    }

    @GetMapping(
            value = "/getAll"
    )
    public Collection<User> getAll() {
        return userService.getAll();
    }

    @PostMapping(
            value = "/addUser",
            produces = {"application/json"}
    )
    public HttpStatus addFirma(@RequestBody(required = true) User user) {
        try {
            userService.addUser(user);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

    @PutMapping(
            value = "/updateUser",
            produces = {"application/json"}
    )
    public HttpStatus updateFirma(@RequestBody(required = true) User user) {
        try {
            userService.updateUser(user);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }


}
