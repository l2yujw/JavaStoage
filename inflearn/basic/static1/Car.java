package static1;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String name;
    private static List<String> cars = new ArrayList<>();
    private static int count = 0;

    public Car(String name) {
        this.name = name;
        count += 1;
        cars.add(name);
    }

    public static void showTotalCar() {
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(count);
    }
}
