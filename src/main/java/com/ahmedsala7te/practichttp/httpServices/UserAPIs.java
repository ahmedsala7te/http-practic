package com.ahmedsala7te.practichttp.httpServices;


import com.ahmedsala7te.practichttp.models.User;
import com.ahmedsala7te.practichttp.parsers.UserParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class UserAPIs {

    public String getUserById(int id) throws IOException {

        String USER_AGENT = "Mozilla/5.0";
        URL obj = new URL("https://reqres.in/api/users/"+id);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
//            UserParser parse = new UserParser();
//            parse.parseUser(String.valueOf(response));




        } else {
            System.out.println("GET request not worked");
        }

        return "";



    }
}
