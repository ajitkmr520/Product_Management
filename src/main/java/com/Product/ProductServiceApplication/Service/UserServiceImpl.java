package com.Product.ProductServiceApplication.Service;

import com.Product.ProductServiceApplication.DTO.UserDTO;
import com.Product.ProductServiceApplication.Entity.UserRegister;
import com.Product.ProductServiceApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserRegister> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserRegister getUserById(Long userId) {
        Optional<UserRegister> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    @Override
    public UserRegister registerUser(UserDTO userDTO) {
        UserRegister user = new UserRegister(userDTO.getUsername(), userDTO.getPassword(), userDTO.getEmail());
        return userRepository.save(user);
    }

    @Override
    public UserRegister updateUser(Long userId, UserDTO userDTO) {
        Optional<UserRegister> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            UserRegister user = optionalUser.get();
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

