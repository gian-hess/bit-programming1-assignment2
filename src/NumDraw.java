// Class for single number draw

public class NumDraw {
	
	// Data declaration
	
	private final int MAX = 50;
	private int draw;
	
	
	// Constructor
	
	public NumDraw() {
		draw = 1;
	}
	
	
	// Number draw Method
	
	public int roll() {
		draw = (int) (Math.random() * MAX) + 1;
		return draw;
	}
	
	
	// Setter Method
	
	public void setDraw (int num) {
		draw = num;
	}
	
	
	// Getter Method
	
	public int getDraw() {
		return draw;
	}
	
	
	// toString Method
	
	public String toString() {
		String result = Integer.toString(draw);
		return result;
	}
}
