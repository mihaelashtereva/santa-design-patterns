package santa_package;

public interface Observable {
	
	void enter(Observer observer);
	void leave(Observer observer);	
	void notifyDwarfs();
	Boolean getUpdate();
}
