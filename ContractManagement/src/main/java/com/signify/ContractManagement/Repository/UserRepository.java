package com.signify.ContractManagement.Repository;

import com.signify.ContractManagement.Entity.User_Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User_Class,Long> {

}
