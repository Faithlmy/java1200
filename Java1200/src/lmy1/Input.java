/*
 * Java�Ļ���֪ʶ��1��
 * */

package lmy1;

import java.sql.Date;
import java.util.Scanner;



public class Input {
	
	
	Input in = new Input();
	String s ;
	
	
	public static void main(String[] args) 
	{
		
		Input input = new Input();
		input.lmy();
		input.lmy2();
		
		
		
	}

	
	
	public Input()
	{
		in.s = "meng";
		System.out.println(s);
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("input your number: ");
		//String line =  scanner.nextLine();
		//System.out.println("��"+ line.length() + "λ������");
	}
	
	public void lmy()
	{
		
		System.out.println("lmy");
		
	}
	public void lmy2()
	{
		System.out.println(new Date(10));
	}
}
