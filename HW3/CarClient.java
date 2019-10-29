import java.util.ArrayList;
import java.util.Collections;

public class CarClient {
	public static void main(String[] args){

        ArrayList <Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota","Corolla",2018));
        cars.add(new Car("Toyota","Camry",2019));
        cars.add(new Car("Kia","Optima",2016)); 
        cars.add(new Car("Toyota","Camry",2010)); 
        cars.add(new Car("Kia","Soul",2015));

        System.out.println(cars.toString());
        Collections.sort(cars);
        System.out.println(cars.toString());

    }
}
