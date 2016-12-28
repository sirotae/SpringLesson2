package lesson2.dao;

import lesson2.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDao {

    public List<User> findAll() {
        User user1 = User.builder().id(1).age(20).name("Test1").build();

        return Arrays.asList(user1);
    }

    public long count () {
        return 1;
    }

    public User findUserById(int id) {
        User user1 = User.builder().id(id).age(20).name("Test20").build();
        return user1;
    }

    public User createUser(User user) {
        return user;
    }
}
