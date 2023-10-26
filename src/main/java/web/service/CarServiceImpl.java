package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Model1", 1, 1970));
        cars.add(new Car("Model2", 2, 1980));
        cars.add(new Car("Model3", 3, 1990));
        cars.add(new Car("Model4", 4, 1960));
        cars.add(new Car("Model5", 5, 1950));
    }

    @Override
    public List<Car> getCarList(int count) {
        return cars.stream()
                .limit(count)
                .toList();
    }

    @Override
    public List<Car> getFullCarList() {
        return cars;
    }


}
