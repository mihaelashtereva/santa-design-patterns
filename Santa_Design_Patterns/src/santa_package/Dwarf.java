package santa_package;

public class Dwarf implements Observer {
	
	private Observable magicalBoard;
	private Boolean isDoll;
	private String name;

	public Dwarf(String name)
	{
		this.name = name;		
	}
	
	@Override
	public void update() {
		this.magicalBoard.getUpdate();
		if(this.magicalBoard == null)
		{
			System.out.println("No magical board!");	
			return;			
		}
		
		this.isDoll = magicalBoard.getUpdate();
		if(this.isDoll)
		{
			System.out.println(this.name + " says that Santa needs a doll!");	
					return;
		}
		
		System.out.println(this.name + " says that Santa needs a bicycle!");	
	}


	@Override
	public void setMagicalBoard(Observable magicalBoard) {
		this.magicalBoard = magicalBoard;
	}

	
	if(isDoll)
	{
		Factory.getToy("Doll");	
	}
	else
	{
		Factory.getToy("Bicycle");
	}

}
