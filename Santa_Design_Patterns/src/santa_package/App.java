package santa_package;

public class App {
	
	Santa santa = Santa.getInstance();
	MagicalBoard board = new MagicalBoard();
	
	Command needDoll = new NeedDollCommand(board);
	Command needBicycle = new NeedBicycleCommand(board);
	
	Dwarf dwarf1 = new Dwarf("Vivi");
	Dwarf dwarf2 = new Dwarf("Mini");
	Dwarf dwarf3 = new Dwarf("Kiki");

	board.enter(dwarf1);
	board.enter(dwarf2);
	board.enter(dwarf3);
	
	santa.setCommand(needDoll);
	santa.speak();
	
	santa.setCommand(needBicycle);
	santa.speak();	

}

