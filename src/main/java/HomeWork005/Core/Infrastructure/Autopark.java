package HomeWork005.Core.Infrastructure;

import HomeWork005.Core.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class Autopark {
    private List<Car> autopark;

    public Autopark() {
        autopark = new ArrayList<>();
    }

    // Add car
    public boolean add(Car car) {
        boolean flag = false;

        if (!autopark.contains(car)) {
            autopark.add(car);
            flag = true;
        }
        return flag;
    }

    // Show auto park
    public Car getCar(int index) {
        return contains(index) ? autopark.get(index) : null;
    }

    // Delete car
    public boolean remove(Car car) {
        boolean flag = false;
        if (autopark.indexOf(car) != -1) {
            autopark.remove(car);
            flag = true;
        }
        return flag;
    }
    private boolean contains(int index) {
        return autopark != null
                && autopark.size() > index;
    }

    public List<Car> getAutopark() {
        return autopark;
    }

    public int count() {
        return autopark.size();
    }
}
