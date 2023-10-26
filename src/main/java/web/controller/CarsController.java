package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String printCountCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}