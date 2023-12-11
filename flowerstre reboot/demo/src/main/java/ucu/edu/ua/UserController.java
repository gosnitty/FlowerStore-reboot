package demo.src.main.java.ucu.edu.ua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/vi/user")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<appUser> getUsers(){
        return userService.getUsers();
    }
    @PostMapping
    public void addUsers(@RequestBody appUser user){
        userService.addUsers(user);
    }

}
