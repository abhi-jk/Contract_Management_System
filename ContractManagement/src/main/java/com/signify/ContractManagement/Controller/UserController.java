package com.signify.ContractManagement.Controller;

import com.signify.ContractManagement.Entity.User_Class;
import com.signify.ContractManagement.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/api/v1/users")
    public User_Class saveUser(@RequestBody User_Class user) {
        //    LOGGER.info("Inside saveDepartment of DepartmentController");
        System.out.println(user.getName());
        return userService.saveUser(user);
    }
    @GetMapping("/api/v1/users/{id}")
    public User_Class getUserById(@PathVariable("id") Long User_id) {
        return userService.getUserById(User_id);
    }
    @PutMapping("/api/v1/users/{id}")
    public User_Class updateUser(@PathVariable("id") Long User_id, @RequestBody User_Class userClass){
        return userService.updateUser(User_id,userClass);
    }
    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable("id") Long User_id) {
        userService.deleteUserById(User_id);

    }
}
