package demo.src.main.java.ucu.edu.ua;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<appUser, Integer>{
}
