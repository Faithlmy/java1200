/*
 * ��ʽ����
 * 
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo03  extends JFrame
{
	//�����Ҫ�����
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	public static void main(String[] args)
	{
		Demo03 demo03 = new Demo03();

	}
	//���캯��
	public Demo03()
	{
		jb1 = new JButton("����");
		jb2 = new JButton("�ŷ�");
		jb3 = new JButton("����");
		jb4 = new JButton("��");
		jb5 = new JButton("����");
		jb6 = new JButton("κ��");
		
		//������
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//������������
		this.setTitle("�߽粼�ְ���");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		//��ֹ�û��ı䴰�ڴ�С
		this.setResizable(false); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//��ʾ����
		this.setVisible(true);
	}

}
