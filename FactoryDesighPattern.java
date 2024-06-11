package SingleTom;

interface Car {
	public abstract void color();
}

class i10 implements Car {
	@Override
	public void color() {
		System.out.println("red Car");
	}
}

class i20 implements Car {
	@Override
	public void color() {
		System.out.println("Blue Car");
	}
}

class CarFactory {
	public static Car getCarinstance(String name) {
		if (name.equalsIgnoreCase("i10")) {
			return new i10();
		} else if (name.equalsIgnoreCase("i20")) {
			return new i20();
		} else {
			return null;
		}
	}
}

public class FactoryDesighPattern {
	public static void main(String[] args) {
          Car carinstance = CarFactory.getCarinstance("i20");
          carinstance.color();
	}

}
