package demo.src.main.java.ucu.edu.ua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<appUser> getUsers(){
        return userRepository.findAll();
    }

    public void addUsers(appUser user) {
        userRepository.save(user);
    }
}