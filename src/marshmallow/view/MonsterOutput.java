package src.marshmallow.view;

import javax.swing.JOptionPane;

public class MonsterOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster infation is:" + info);
	}
	
} 