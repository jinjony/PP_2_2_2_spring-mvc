package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Integer gelCountAllCars();
    public List<Car> getHowManyCars(int count);
}