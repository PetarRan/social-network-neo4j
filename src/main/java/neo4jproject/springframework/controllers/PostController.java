package neo4jproject.springframework.controllers;

import neo4jproject.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/neo4j/post")
public class PostController {
    private UserService productService;

    public void setProductService(UserService productService) {
        this.productService = productService;
    }



}
