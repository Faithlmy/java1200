/*
 * QQ �����¼
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo10 extends JFrame
{
	//�������
	JTextArea jta = null;
	JScrollPane jsp = null;
	JPanel jp = null;
	JComboBox jc = null;
	JTextField jtf = null;
	JButton jb = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo10 demo10= new Demo10(); 
	}
	//���캯��
	public Demo10()
	{
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jp = new JPanel();
		String []ch = {"��ʲ", "����"};
		jc = new JComboBox(ch);
		jtf = new JTextField (10);
		jb = new JButton("����");
		
		//���ò���
		
		//������
		jp.add(jc);
		jp.add(jtf);
		jp.add(jb);
		
		//����JFrame
		this.add(jsp);
		this.add(jp, BorderLayout.SOUTH);
		
		this.setSize(300,200);
		this.setTitle("��Ѷqq");
		this.setIconImage((new ImageIcon("Images/qq.png")).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}

}
