package com.example.greeting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, String> {
    // custom methods go here (later)
    // ReturnType operationByAttribute(param)

    Greeting findById(int id);

}