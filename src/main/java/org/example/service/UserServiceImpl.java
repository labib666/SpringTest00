package org.example.service;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("userService")
@Scope(scopeName = BeanDefinition.SCOPE_SINGLETON)
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl() {
        System.out.println("const no arg");
    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        System.out.println("const with arg");
        this.userRepository = userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        System.out.println("setter");
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        if (userRepository == null) {
            return new LinkedList<>();
        }
        return userRepository.getUsers();
    }
}
