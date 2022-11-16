package com.ahmedsala7te.practichttp;

import com.ahmedsala7te.practichttp.httpServices.UserAPIs;
import com.ahmedsala7te.practichttp.models.User;
import com.ahmedsala7te.practichttp.parsers.UserParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PracticHttpApplication {

	public static void main(String[] args) throws IOException {
		UserAPIs getUser = new UserAPIs();
		String u1 = getUser.getUserById(5);
        UserParser parse = new UserParser();
        parse.parseUser(u1);
		User u2 = new User();
		u2.setId(5);
		u2.setEmail("charles.morris@reqres.in");
		u2.setFirst_name("Charles");
		u2.setLast_name("Morris");
		System.out.printf("[id=%d , email=%s , firstName = %s, lastName=%s]\n", u2.getId(),u2.getEmail(),u2.getFirst_name(),u2.getLast_name() );
	}

}
