// Lottery Draw which executes the draw

import java.util.Scanner;

public class LotteryDraw {

	public static void main(String[] args) {
		
		TicketDraw ticket1 = new TicketDraw();
		TicketDraw winTicket = new TicketDraw();
		
		
		// Picks from user
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("You can now enter six picks from the numbers 1 - 50 for the lottery draw:");
		
		System.out.println("Please pick your first number: \t");
		int pick1 = scan.nextInt();
		
		System.out.println("Please pick your second number: \t");
		int pick2 = scan.nextInt();
		
		System.out.println("Please pick your third number: \t");
		int pick3 = scan.nextInt();
		
		System.out.println("Please pick your fourth number: \t");
		int pick4 = scan.nextInt();
		
		System.out.println("Please pick your fifth number: \t");
		int pick5 = scan.nextInt();
		
		System.out.println("Please pick your last number: \t");
		int pick6 = scan.nextInt();
		
		
		// Set Picks for the lottery ticket
		
		ticket1.setDraw(ticket1.num1, pick1);
		ticket1.setDraw(ticket1.num2, pick2);
		ticket1.setDraw(ticket1.num3, pick3);
		ticket1.setDraw(ticket1.num4, pick4);
		ticket1.setDraw(ticket1.num5, pick5);
		ticket1.setDraw(ticket1.num6, pick6);
		
		System.out.println();
		
		System.out.println("Your picked the following Numbers: " + ticket1);
		
		System.out.println();
		
		
		// Draw the winning ticket
		
		winTicket.drawTicket();
		
		System.out.println("The winning draw is: " + winTicket);
		
	}
}
