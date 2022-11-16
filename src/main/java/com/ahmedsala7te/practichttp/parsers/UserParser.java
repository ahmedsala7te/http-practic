package com.ahmedsala7te.practichttp.parsers;

import com.ahmedsala7te.practichttp.models.User;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class UserParser {
    public User parseUser(String user) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode dataNode = objectMapper.readTree(user);
        JsonNode userNode = dataNode.path("data");
        User parsedUser = objectMapper.treeToValue(userNode, User.class);
        //System.out.printf("[id=%d , email=%s , firstName = %s, lastName=%s]\n", parsedUser.getId(),parsedUser.getEmail(),parsedUser.getFirst_name(),parsedUser.getLast_name() );

        return parsedUser;
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(DeserializationFeature. ACCEPT_SINGLE_VALUE_AS_ARRAY);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        //System.out.println("userData " + user);
        //JsonNode data = objectMapper.readTree(user);
        //JsonNode userData = data.get("data");
//        int id = userData.get("id").asInt();
//        String email = userData.get("email").asText();
//        String first_name = userData.get("first_name").asText();
//        String last_name = userData.get("last_name").asText();

        //User getUser = new User();
//        getUser.setId(userData.get("id").asInt());
//        getUser.setEmail(userData.get("email").asText());
//        System.out.println("id: " + id + " email: " + email);
//        List<User> getV = objectMapper.readValue(user, new TypeReference<List<User>>() {});
        //User getV = objectMapper.readValue(user, User.class);
//        for (User p : getV.getPerson()) {
//            System.out.println(p); }

        //User getV = objectMapper.readValue(user, User[])
       //System.out.println(getV.getId());
//       getV.forEach(post -> System.out.printf("[id=%d , email=%s]\n",post.getId(),post.getEmail()));
    }


}




