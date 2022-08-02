package com.cars.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class carController {
    @Autowired
    private CarRepository repository;

    @GetMapping(value = "/listCars")
    private String getCar(){
        String uri = "http://api-test.bhut.com.br:3000/api/cars";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @PostMapping(value = "/createCar")
    private String postCar(@RequestBody Car car){
        String uri = "http://api-test.bhut.com.br:3000/api/cars"; 
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.postForObject(uri, car, String.class);
        System.out.println(result);
        String dateTime = java.time.LocalDateTime.now().toString();	
        car.setDateTime(dateTime);
		repository.save(car);
        return result;
    }

    @GetMapping(value = "/logs")
    private String getLogs(){
        List<Car> cars = repository.findAll();
        String json = new Gson().toJson(cars);
        return json;
    }

}