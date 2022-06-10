package santa_package;

public class NeedDollCommand implements Command{
	
	private MagicalBoard magicalBoard; //reciever
	
	public NeedDollCommand(MagicalBoard magicalBoard)
	{	
		this.magicalBoard = magicalBoard;
	}
	
	public void execute() {
		System.out.println("A doll is needed!");	
		this.magicalBoard.needDoll();
		
	}

}
