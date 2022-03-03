package com.bstest.newsbs.repository;

import com.bstest.newsbs.entity.User;
import com.bstest.newsbs.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void findByUsername(){
        User user = new User();
        user.setUsername("刘宇");
        user.setNickname("刘宇老公");
        user.setPassword("0824");
        user.setGender(Gender.MALE);
        user.setEnabled(true);
        user.setLocked(false);
        user.setLastLoginTime(new Date());
        user.setLastLoginip("127.0.0.1");

        User saveduser = repository.save(user);

        User result = repository.getByUsername("刘宇");
        System.out.println(result.toString());
    }
}
