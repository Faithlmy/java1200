/*
 * Author:lmy
 * Time:04/08/16
 * topic:ͼ�ν��濪��
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo01 extends JFrame
{
	//����Ҫ��Swing��������ڴ˴���������Ĺ��캯�������ʼ��
	JButton jb1 = null;

	public static void main(String[] args) 
	{
		Demo01 demo01 = new Demo01();
	}
	
	//���캯��
	public Demo01()
	{
		// TODO Auto-generated method stub
				//JFrame��һ�����������������������Swing������ࣩ
				
				
			     jb1 = new JButton("���ǰ�ť");
				//���ô������
				this.setTitle("hello");
				
				//���ô�С,�����أ��ܶȵ�λ����
				//##this.setSize(200, 200);
				
				this.add(jb1);
				
				//���ó�ʼλ��
				this.setLocation(100, 200);
				
				//���ùرմ��ڵ�ʱ�򣬱�֤Jvm�˳�
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//��ʾ
				this.setVisible(true);
	}

}
