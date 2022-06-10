package santa_package;

public class Bicycle extends Toy{

	public Bicycle(String color, String name) {
		super(color, name);
	}

	@Override
	public void decorate() {
		System.out.println("A bicycle was decorated.");
		
	}

}
