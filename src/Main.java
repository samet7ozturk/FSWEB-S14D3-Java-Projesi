import com.workintech.carCompany.CarSkeleton;
import com.workintech.carCompany.ElectricCar;
import com.workintech.pacificCarCompany.Car;
import com.workintech.pacificCarCompany.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car mitsubishi = new Mitsubishi(4, "Lancer");

        System.out.println(mitsubishi);

        CarSkeleton carSkeleton = new ElectricCar(5, 90);

        System.out.println(carSkeleton);
    }
}