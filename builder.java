package Builder;
class Car {
	private String name;
	private String color;
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "car [name=" + name + ", color=" + color + "]";
	}
}

class CarX {
	private String name;
	private String color;

	public CarX name(String name) {
		this.name = name;
		return this;
	}

	public CarX color(String color) {
		this.color = color;
		return this;
	}
	
	public  Car build() {
		return new Car(name , color);
		
	}
}
public class Builder {
	
    public static void main(String[] args) {
        Car car = new CarX().name("Tesla").color("Red").build();
        System.out.println(car);       
	}
}