/*
 * ����ͼ
 * */

package lmy6.www;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo14 extends JFrame
{
	 Mm_panel mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo14 demo14 = new Demo14();
	}
	
	//���캯��
	public Demo14()
	{
		mp =new Mm_panel();
		//ע�����
		this.addMouseListener(mp);
		// this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		
		this.add(mp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//��Mm_panel֪������������Ϣ������֪�����������
//��Mm_panel֪�����ĸ�������
//��Mm_panel֪������ƶ� ��ק
//��Mm_panel֪�����ڵı仯����С  ���  ��


class Mm_panel extends JPanel implements WindowListener ,MouseListener,MouseMotionListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
		
	}

	//���
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������� x=" + e.getX() + "y=" + e.getY());
	}

	//����
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//�ɿ�
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//�ƶ�����
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//����˳�
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x=" + e.getX());
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
