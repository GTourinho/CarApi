package com.cars.test;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String>{
    List<Car> findByBrand(String brand);
	List<Car> findByAge(int age);
	List<Car> findByPrice(String price);
	List<Car> findByTitle(String title);
}
