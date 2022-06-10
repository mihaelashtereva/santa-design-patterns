package santa_package;

public abstract class Toy {
	
	private String color;
	private String name;
	
	public Toy(String color, String name)
	{
		this.color = color;
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void decorate();
	}
