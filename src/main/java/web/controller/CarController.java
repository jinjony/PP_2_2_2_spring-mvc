package web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController() {
        this.carService = new CarServiceImpl();
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model,
                          @RequestParam(value = "count", required = false) Integer count) {
        if (count == null) count = carService.gelCountAllCars();
        List<Car> carList = carService.getHowManyCars(count);
        model.addAttribute("cars", carList);
        return "cars";

    }
}