package santa_package;

public class Santa {
	
	private Command command;
	private static Santa instance;
	
	Santa() {}
	
	public static Santa getInstance() {
		if(instance==null)
		{
			instance = new Santa();
		}
		return instance;
		
	}
	
	public void setCommand(Command command)
	{
		this.command = command;		
	}
	
	public void speak() {
		if(this.command == null)
		{
			System.out.println("Santa doesn't need toys.");	
			return;
		}
		this.command.execute();
	}
	
}
