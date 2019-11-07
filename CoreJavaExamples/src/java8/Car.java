package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//This class explains Java 8 feature of method references
public class Car {

	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}

	public static void collide(final Car car) {
		System.out.println("Collided changed " + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + another.toString());
	}

	public void repair() {
		System.out.println("Repaired " + this.toString());
	}

	public static void main(String args[])
	{
		System.out.println("-----------------");
		final Car car = Car.create( Car::new );
		final List< Car > cars = Arrays.asList( car );
		System.out.println("-----------------");
		cars.forEach( Car::collide );
		System.out.println("-----------------");
		cars.forEach( Car::repair );
		System.out.println("-----------------");
		final Car police = Car.create( Car::new );
		cars.forEach( police::follow );

	}
}
