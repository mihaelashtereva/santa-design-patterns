package santa_package;

public class Doll extends Toy{

	public Doll(String color, String name) {
		super(color, name);
	}

	@Override
	public void decorate() {
		System.out.println("A doll was decorated.");
		
	}
}