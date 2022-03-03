package com.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    GreetingRepository repository;

    private List<Greeting> greetings = new ArrayList<Greeting>();

    @DeleteMapping("/greeting/{greeting}")
    public String deleteGreeting(@PathVariable String greeting) {
        greetings.remove(greeting);
        return "Greeting Deleted";
    }

    @PostMapping("/greeting")
    public String createGreeting(@RequestBody Greeting greeting) {
        repository.save(greeting);
        return "Success, greeting has been added";
    }

    @GetMapping("/welcome")
    public String sayHi() {
        return "Welcome to server side programming";
    }

    @GetMapping("/greeting/{id}")
    public Greeting getGreetingById(@PathVariable String id) {
        return repository.findById(Integer.parseInt(id));
    }



    @GetMapping("/greeting")
    public String getCustomGreeting(@RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping("/greetings")
    public List<Greeting> getGreetings() {
        return repository.findAll();
    }
}