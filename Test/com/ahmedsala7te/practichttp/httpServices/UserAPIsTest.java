package com.ahmedsala7te.practichttp.httpServices;

import com.ahmedsala7te.practichttp.models.User;
import com.ahmedsala7te.practichttp.parsers.UserParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class UserAPIsTest {
    @Test
    void compareUser () throws IOException {

        UserAPIs getUser = new UserAPIs();
        String u1 = getUser.getUserById(2);
        UserParser parse = new UserParser();
        User user1 = parse.parseUser(u1);
        User u2 = new User();
        u2.setId(5);
        u2.setEmail("charles.morris@reqres.in");
        u2.setFirst_name("Charles");
        u2.setLast_name("Morris");
        Assertions.assertTrue(u2.equals(user1));
    }

}