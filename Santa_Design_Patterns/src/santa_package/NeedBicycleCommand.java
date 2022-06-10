package santa_package;

public class NeedBicycleCommand implements Command{

	private MagicalBoard magicalBoard; //reciever
	
	public NeedBicycleCommand(MagicalBoard magicalBoard)
	{	
		this.magicalBoard = magicalBoard;
	}
	
	public void execute() {
		System.out.println("A doll is needed!");	
		this.magicalBoard.needDoll();		
	}
}
