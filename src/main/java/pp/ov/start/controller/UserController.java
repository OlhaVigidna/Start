package pp.ov.start.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pp.ov.start.UserService;
import pp.ov.start.model.Client;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

   private static final Logger log = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Client getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }


    @GetMapping()
    public List<Client> getAllUsers() {
//        log.info("INFO!!!!!!!");
        return userService.getAll();
    }

    @PostMapping
    public Integer create(@RequestBody Client u) {
        return userService.create(u);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }
}
