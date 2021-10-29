// Class for a lottery ticket, creates 6 NumDraw objects based on NumDraw Class

public class TicketDraw {
	
	// Data declaration
	// Declaring 6 numDraw Objects

	public NumDraw num1;
	public NumDraw num2;
	public NumDraw num3;
	public NumDraw num4;
	public NumDraw num5;
	public NumDraw num6;
	
	
	// Constructor
	
	public TicketDraw() {
		num1 = new NumDraw();
		num2 = new NumDraw();
		num3 = new NumDraw();
		num4 = new NumDraw();
		num5 = new NumDraw();
		num6 = new NumDraw();
	}
	
	
	// Draw Ticket Method
	// Roll the 6 Objects
	
	public void drawTicket() {
		num1.roll();
		num2.roll();
		num3.roll();
		num4.roll();
		num5.roll();
		num6.roll();
	}
	
	
	// Setter Method
	// Set the draw of the object with the object and the desired number as parameters
	
	public void setDraw(NumDraw draw, int num) {
		draw.setDraw(num);
	}
	
	
	// Getter Method
	// get the draw from a specific object
	
	public int getDraw(NumDraw draw) {
		return draw.getDraw();
	}
	
	
	// toString Method
	
	public String toString() {
		return (  num1.getDraw() + "\t"
				+ num2.getDraw() + "\t"
				+ num3.getDraw() + "\t"
				+ num4.getDraw() + "\t"
				+ num5.getDraw() + "\t"
				+ num6.getDraw() + "\t");
	}
	
}
