package com.claudiotraspadini.core.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claudiotraspadini.core.model.User;

@RestController
public class UserResource {

  private Map<Integer, User> users;

  public UserResource() {
    users = new HashMap<Integer, User>();

    User u1 = new User("User 1");
    User u2 = new User("User 2");
    User u3 = new User("User 3");

    users.put(1, u1);
    users.put(2, u2);
    users.put(3, u3);
  }

  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResponseEntity<List<User>> list() {
    return new ResponseEntity<List<User>>(new ArrayList<User>(users.values()), HttpStatus.OK);
  }

}
