package view;

import java.awt.GradientPaint;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TabStart extends JPanel{
	private static GridBagLayout gbl = new GridBagLayout();
	private JButton btn1 = new JButton("btn1");
	private JButton btn2 = new JButton("btn2");

	
	public TabStart(){
		super(gbl);
		add(btn1, Utility.makegbc(0, 0, 1, 1));
		add(btn2, Utility.makegbc(1, 1, 1, 1));
	}
}
