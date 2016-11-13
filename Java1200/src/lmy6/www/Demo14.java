/*
 * 鼠标绘图
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
	
	//构造函数
	public Demo14()
	{
		mp =new Mm_panel();
		//注册监听
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
//让Mm_panel知道按下鼠标的信息，并且知道点击的坐标
//让Mm_panel知道是哪个键按下
//让Mm_panel知道鼠标移动 拖拽
//让Mm_panel知道窗口的变化（最小  最大  ）


class Mm_panel extends JPanel implements WindowListener ,MouseListener,MouseMotionListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
		
	}

	//点击
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击了 x=" + e.getX() + "y=" + e.getY());
	}

	//按下
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//松开
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//移动进来
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//鼠标退出
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
