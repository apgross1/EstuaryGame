package models;

public abstract class BarModelAbstract {
	private int status;
	private String name;
	private int maxLevel;
	
	public BarModelAbstract() {
		
	}
	
	public abstract void increase();
	
	public abstract void decrease();
	
	public boolean isEmpty() {
		if (status == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
