/*
 * �ʰ�
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;

public class Demo09  extends JFrame
{
	//�������
	JSplitPane  jsp;
	JList jlist;
	JLabel jb1;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo09 demo09 = new Demo09();
	}
	//���캯��
	public Demo09()
	{
		//�������
		String []words = {"boy", "dog", "bird"};
		jlist = new JList(words);
		
		jb1 = new JLabel(new ImageIcon("images/55.jpg"));
		//jb2 = new JLabel(new ImageIcon("images/66.jpg"));
		
		//������ִ���
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist, jb1);
		
		//���ڱ仯
		jsp.setOneTouchExpandable(true);
		
		//���ò��ֹ�����
		
		//������
		this.add(jsp);
		
		//���ô�С
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
