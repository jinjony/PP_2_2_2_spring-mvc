package web.repositories;

import web.model.Car;

import java.util.*;

public class CarRepositoryImpl implements CarRepository {
    @Override
    public List<Car> getAllCars() {
        //3. Создайте список из 5 машин.
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedes-Benz", "Maybach S-Class", 37_500_000.0));
        carList.add(new Car("Mercedes-Benz", "GLE", 16_200_000.0));
        carList.add(new Car("Mercedes-Benz", "AMG GT I Restyling", 42_800_000.0));
        carList.add(new Car("Mercedes-Benz", "Maybach GLS I", 35_500_000.0));
        carList.add(new Car("Mercedes-Benz", "G-Class AMG II (W463)", 34_100_000.));
        return carList;
    }

    @Override
    public Integer gelCountAllCars() {
        return getAllCars().size();
    }

    @Override
    public List<Car> getHowManyCars(int count) {
        if (count < gelCountAllCars() && count > 0) {
            return getAllCars().subList(0, count);
        } else if (count >= gelCountAllCars()) {
            return getAllCars();
        } else {
            List<Car> carList = new ArrayList<>();
            carList.add(new Car("Empty", "empty", 0.0));
            return carList;
        }
    }
}