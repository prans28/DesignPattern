package SingleTom;

class Car {

	static Car car = new Car();

	private Car() {

	}

	public static Car getInstance() {
		return car;
	}

}

public class SingleTom {
	public static void main(String[] args) {
		Car instance = Car.getInstance();
		Car instance1 = Car.getInstance();
		System.out.println(instance);
		System.out.println(instance1);

	}
}