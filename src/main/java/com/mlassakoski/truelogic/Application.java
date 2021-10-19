package com.mlassakoski.truelogic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

        final School school = new School();
        school.addStudent("tom", 2);
        school.addStudent("ian", 2);
        school.addStudent("fred", 2);
        school.addStudent("alice", 1);
        school.addStudent("victor", 1);
        school.addStudent("chris", 3);
        school.addStudent("kim", 3);
        school.addStudent("sam", 3);

        final List<Grade> sortedRoster = school.getSortedRoster();

        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String json = gson.toJson(sortedRoster);

        // expected roster:
        System.out.println(json);
    }

}
