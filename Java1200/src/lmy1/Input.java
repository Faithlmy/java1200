/*
 * Java�Ļ���֪ʶ��1��
 * ����
 * 1��һ�ж��Ƕ���ͨ�����ݱ�־���������ö��󣨵��ӻ���ң�أ�
 * 2���洢�������P60��
 * 3���������ͣ�
 * 		boolean  char  byte short int long  float double void
 * 4����װ�����ͣ�
 * 		Boolean  character Byte Short Integer Long Float Double Void
 * 5���߾������֣�BigInteger  BigDecimal
 * 6�����飺
 * 7����Զ�������ٶ���
 * 8��new һ�������ʱ�������Դ����������֮�⣬�� s�����õ���ʧ�� sָ��Sting�����Լ���ռ���ڴ�ռ�
 * 9��static�ؼ��֣�
 * 		1�����ÿ��Ǵ������ٶ��������������ô�������
 * 		2)��ʹû�д�������Ҳ�ܵ����������
 * */

package lmy1;

import java.sql.Date;
import java.util.Scanner;



public class Input {
	
	
	//Input in = new Input();
	
	String s ;//��ֻ��һ�����ã������Ƕ���
	String t = "first";//����һ���Ƚϰ�ȫ�������������õ�ͬʱ�ͳ�ʼ��
	String t1 = new String("second");//��������д
	
	static String t2 = new String("hello");//��̬����
	
	
	public static void main(String[] args) 
	{
		
		Input input = new Input();
		
		System.out.println("main�е�"+input.t);
		input.lmy();
		
		System.out.println("main�е�"+Input.t2);//static����ı�������ͨ������������
		System.out.println("main�е�"+input.t2);//Ҳ����ͨ���¶���Ķ���ȥ������
		
		/*��ѯһЩ��Ϣ*/
		System.getProperties().list(System.out);
		System.out.println("Input.main()");
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
		
		
	}

	
	
	public Input()
	{
		System.out.println("���캯���е�"+Input.t2);

		//in.s = "meng";
		//System.out.println(s);
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("input your number: ");
		//String line =  scanner.nextLine();
		//System.out.println("��"+ line.length() + "λ������");
	}
	
	public void lmy()
	{
		Input m = new Input();
		System.out.println("lmy�е�"+m.t1);
		System.out.println("lmy�е�"+"lmy");
		System.out.println("lmy�е�"+Input.t2);
		System.out.println("lmy�е�"+m.t2);
	}


}
