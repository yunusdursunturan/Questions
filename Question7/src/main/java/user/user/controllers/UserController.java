package user.user.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.user.models.Entity.User;
import user.user.service.UserService;

/**
 *993 */
@Controller
@RequestMapping(value="/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/delete",method = RequestMethod.DELETE)
    public ResponseEntity<User> delete(@RequestParam int id) {
        try {
            User user= new User(id);
            userService.delete(user);
            return new ResponseEntity<User>( HttpStatus.OK);
        }
        catch(Exception ex) {
            return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
        }

    }


    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ResponseEntity<User> create(@RequestBody User user) {
        try {
            userService.save(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
        }
        catch(Exception ex) {
              return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<User> update(@RequestBody User user){
        try {
            userService.update(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
        }
        catch(Exception ex) {
            return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<User> get(@RequestParam int userId){
        try {
            User user= userService.getUser(userId);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        catch(Exception ex) {
            return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
        }

    }

}