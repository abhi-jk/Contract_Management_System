package com.signify.ContractManagement.Services;

import com.signify.ContractManagement.Entity.User_Class;

public interface UserService {


     User_Class saveUser(User_Class user);

     User_Class getUserById(Long userId);

     User_Class updateUser(Long userId, User_Class userClass);

     void deleteUserById(Long userId);
}
