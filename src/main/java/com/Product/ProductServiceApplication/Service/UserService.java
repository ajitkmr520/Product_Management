package com.Product.ProductServiceApplication.Service;

import com.Product.ProductServiceApplication.DTO.UserDTO;
import com.Product.ProductServiceApplication.Entity.UserRegister;

import java.util.List;

public interface UserService {
    List<UserRegister> getAllUsers();
    UserRegister getUserById(Long userId);
    UserRegister registerUser(UserDTO userDTO);
    UserRegister updateUser(Long userId, UserDTO userDTO);
    void deleteUser(Long userId);
}

