/*
 * ���񲼾�
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;

public class Demo04 extends JFrame
{
	int size = 9;
	//�������
	JButton jbs[] =new JButton[size];
	public static void main(String[] args) 
	{
		//����ʵ��
		Demo04 demo04 = new Demo04();
	}
	//���캯��
	public Demo04()
	{
		
		//�������
		for(int i = 0; i<size; i++)
		{
			jbs[i] = new JButton(String.valueOf(i));
		}
		//�������񲼾�
		this.setLayout(new GridLayout(3, 3, 10, 10));
		
		//������
		for(int i = 0; i<size; i++)
		{
			this.add(jbs[i]);
		}
		
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		
		//��ʾ
		this.setVisible(true);
	}

}
