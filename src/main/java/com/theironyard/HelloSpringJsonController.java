package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DrScott on 11/9/15.
 */
@RestController  //used for returning json
public class HelloSpringJsonController {
    @RequestMapping("/person.json")
    public Person person(
           @RequestParam(defaultValue = "Doug") String name,
           @RequestParam(defaultValue = "Charleston") String city,
            @RequestParam(defaultValue = "29")Integer age){
       return new Person(name, city, age);
    }
}
