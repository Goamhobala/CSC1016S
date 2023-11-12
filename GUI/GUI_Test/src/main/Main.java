package main;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Main {
	public static void main(String args[]) {
		MainWindow win = new MainWindow(800, 600);
		JButton btn1 = new JButton("Hi");
		btn1.setVisible(true);
		win.add(btn1);
		
	}
}
