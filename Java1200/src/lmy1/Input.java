package lmy1;

import java.sql.Date;
import java.util.Scanner;



public class Input {
	public static void main(String[] args) {
		
		Input input = new Input();
		input.lmy();
		input.lmy2();
		
	}

	
	
	public Input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your number: ");
		String line =  scanner.nextLine();
		System.out.println("是"+ line.length() + "位的数字");
	}
	
	public void lmy()
	{
		
		System.out.println("lmy");
		
	}
	public void lmy2()
	{
		System.out.println(new Date(0));
	}
}
