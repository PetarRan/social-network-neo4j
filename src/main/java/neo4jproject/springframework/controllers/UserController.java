package neo4jproject.springframework.controllers;

import neo4jproject.springframework.domain.User;
import neo4jproject.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/rest/neo4j/user")
public class UserController {
    private UserService userService;


    @Autowired
    public void setProductService(UserService productService) {
        this.userService = productService;
    }

    @GetMapping(
            value = "/getAll"
    )
    public Collection<User> getAll() {
        return userService.getAll();
    }


    @RequestMapping({"/product/list", "/product"})
    public String listProducts(Model model){
        model.addAttribute("products", userService.listAll());
        return "product/list";
    }

    @RequestMapping("/product/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", userService.getById(Long.valueOf(id)));
        return "product/show";
    }


    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable String id){
        userService.delete(Long.valueOf(id));
        return "redirect:/product/list";
    }
}
