package com.example.demo.controller;

import com.example.demo.persistance.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.view.UserViews;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity createUsers(@Valid @RequestBody UserViews userViews) {
        return userService.save(userViews);
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable Long id) {
        return userService.findById(id);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PutMapping("/{id}") // @Valid essa annotation manda fazer aas validações do @notnull e @NotEmpty da view
    public UserEntity fullUpdate(@PathVariable Long id, @Valid @RequestBody UserViews userViews) {

        return userService.fullUpdate(id, userViews);
    }


    @PatchMapping("/{id}") // @Valid essa annotation manda fazer aas validações do @notnull e @NotEmpty da view
    public UserEntity patch(@PathVariable Long id, @RequestBody UserViews userViews) {

        return userService.patch(id, userViews);
    }
}
