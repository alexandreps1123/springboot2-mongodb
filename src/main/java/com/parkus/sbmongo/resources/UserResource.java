package com.parkus.sbmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parkus.sbmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "May", "may@email.com");
        User ale = new User("2", "Ale", "ale@email.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, ale));

        return ResponseEntity.ok().body(list);
    }
    
}
