/*
 * BorderLayout
 * 
 * 1���̳�JFrame
 * 2��������Ҫ�����
 * 3���������
 * 4��������
 * 5��������������
 * 6����ʾ����
 * 
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo02 extends JFrame
{
	
	//�������
	JButton jb1, jb2, jb3, jb4, jb5;
	public static void main(String[] args) {
		
		 Demo02 demo02 = new Demo02();
		
	}
	public Demo02()
	{
		//�������
		
		jb1 = new JButton("�в�");
		jb2 = new JButton("����");
		jb3 = new JButton("����");
		jb4 = new JButton("�ϲ�");
		jb5 = new JButton("����");

		//������
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.EAST);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.NORTH);
		
		//������������
		this.setTitle("�߽粼�ְ���");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		this.setVisible(true);
	}

}
