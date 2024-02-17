package com.signify.ContractManagement.Services;

import com.signify.ContractManagement.Entity.User_Class;
import com.signify.ContractManagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User_Class saveUser(User_Class user) {
        return userRepository.save(user);
    }

    @Override
    public User_Class getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User_Class updateUser(Long userId, User_Class userClass) {
        User_Class deptDB = userRepository.findById(userId).get();

        if(Objects.nonNull(userClass.getName()) && !"".equalsIgnoreCase(userClass.getName())){
            deptDB.setName(userClass.getName());
        }
        if(Objects.nonNull(userClass.getEmail()) && !"".equalsIgnoreCase(userClass.getEmail())){
            deptDB.setEmail(userClass.getEmail());
        }
        if(Objects.nonNull(userClass.getPhoneNumber()) && !"".equalsIgnoreCase(userClass.getPhoneNumber())){
            deptDB.setName(userClass.getName());
        }
        return userRepository.save(deptDB);
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
