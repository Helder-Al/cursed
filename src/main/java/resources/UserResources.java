package resources;

import entities.User;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> FindAll(){
        User u = new User(1L, "Mario", "Mario@gmail.com","9999999","132");
        return ResponseEntity.ok().body(u);
    }


}
