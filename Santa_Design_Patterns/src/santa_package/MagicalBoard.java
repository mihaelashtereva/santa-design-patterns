package santa_package;

import java.util.List;

public class MagicalBoard implements Observable{

	private List<Observer> dwarfs;
	private Boolean needDoll;
	
	public MagicalBoard() {}
	
	public void needBicycle() {
		this.needDoll = false;	
		System.out.println("Santa needs a bike");
		this.notify();
	}
	
	public void needDoll() {
		this.needDoll = true;	
		System.out.println("Santa needs a bike");
		this.notify();
	}
		


	@Override
	public void notifyDwarfs() {
		for(Observer dwarf : this.dwarfs) {
			dwarf.update();		
		}
	}

	@Override
	public Boolean getUpdate() {
		return this.needDoll;
	}

	@Override
	public void enter(Observer observer) {
		if(this.dwarfs.size()<3)
		{
			this.dwarfs.add(observer);
			observer.setMagicalBoard(this);
			System.out.println("New dwarf entered.");
		}
		System.out.println("There already are 3 dwarfs in the factory.");
	}

	@Override
	public void leave(Observer observer) {
		this.dwarfs.remove(observer);
		observer.setMagicalBoard(null);
	}

}
