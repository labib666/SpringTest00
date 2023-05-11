package org.example.repository;

import org.example.model.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository("userRepository")
@Scope(scopeName = BeanDefinition.SCOPE_SINGLETON)
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getUsers() {
        User defaultUser = new User();
        defaultUser.setId("user");
        defaultUser.setName("username");

        return new LinkedList<>() {{
            add(defaultUser);
        }};
    }
}
