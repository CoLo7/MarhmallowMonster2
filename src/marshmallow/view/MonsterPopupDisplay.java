package src.marshmallow.view;

import javax.swing.JOptionPane;

public class MonsterPopupDisplay
{
	/**
	 * Displays what the user typed in as a popup window. 
	 * @param userInput the text that will be displayed
	 */
	
	public void showResponse(String userInput)
	{
		JOptionPane.showMessageDialog(null, userInput);
	}
	
	/**
	 * Displays popup with supplied String with a field to type in a response
	 * It returns answer to the supplied question as a String.
	 * @param monsterQuestion question to be displayed in popup window
	 * @return The user's input as a String data type.
	 */
	
	public String grabAnswer(String monsterQuestion)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, monsterQuestion);
		
		return answer;
		
	}
}
