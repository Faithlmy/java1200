/*
 * 
 * */

package lmy6;

import java.awt.*;
import javax.swing.*;

public class Demo08 extends JFrame
{
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JList  jlist;

	JComboBox jcb1;
	JScrollPane jsp;
	
	public static void main(String[] args) {
		Demo08 demo08 = new Demo08();
	}
	//���캯��
	public Demo08()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("��ļ��᣺");
		jl2 = new JLabel("���εص�");
		
		String []jg = {"����","ɽ��","����"};
		jcb1 = new JComboBox(jg);
		
		String []dd = {"����", "�ʹ�", "�찲��","��̳","�׶�����"};
		jlist = new JList(dd);
		jlist.setVisibleRowCount(5);
		jsp = new JScrollPane(jlist);
		//����������ʾ�ĸ���
		
		//���ò���
		this.setTitle("�û�����");
		this.setLayout(new GridLayout(3,1));
		
		//������
		jp1.add(jl1);
		jp1.add(jcb1);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}

	
	

}
