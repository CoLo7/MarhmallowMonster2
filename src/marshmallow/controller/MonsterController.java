package src.marshmallow.controller;

import src.marshmallow.model.MarshmallowMonster;
import src.marshmallow.view.MonsterOutput;
import java.util.Scanner;
import src.marshmallow.view.MonsterPopupDisplay;

public class MonsterController
{
	private MarshmallowMonster gabeMonster;
	private MarshmallowMonster userMonster;
	private MonsterOutput myOutput;
	private Scanner monsterScanner;
	private MonsterPopupDisplay myPopups;
	
	
	public MonsterController()
	{
		int eyes = 5;
		int noses = 1;
		double legs = 6;
		double hair = 3;
		boolean hasBellyButton = false;
		String name = "BullyMong";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MonsterOutput();
		gabeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		myPopups = new MonsterPopupDisplay();
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(gabeMonster.toString());
		myOutput.displayMonsterGUI(gabeMonster.toString());
		//this.makeUserMonster();
		//myOutput.displayMonsterConsole("New Monster Info " + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		gabeMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		gabeMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a different number of Noses");
		int betterMonsterNoses = monsterScanner.nextInt();
		gabeMonster.setMonsterNoses(betterMonsterNoses);
		
		System.out.println("Type in how many hairs you want the monster to have");
		double betterMonsterHair = monsterScanner.nextDouble();
		gabeMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in how many legs you want your monster to have");
		double betterMonsterLegs = monsterScanner.nextDouble();
		gabeMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Type in how many belly buttons you want your monster to have");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		gabeMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}
	/**
	 * This method will create the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
	  //Step one: Get Variables
		String userName;
		int userEyeCount;
		int userNoseCount;
		double userHairCount;
		double userLegCount;
		boolean userBellyButton;
			
	//Step two: Define variables by using Scanner to get user input.	
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster");
		userEyeCount = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for your monster");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("Type in the number of hair you want for your monster");
		userHairCount = monsterScanner.nextDouble();
		System.out.println("Type in the number of Legs your want your monster to have");
		userLegCount = monsterScanner.nextDouble();
		System.out.println("Does your monster have a belly button? True or False?");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor!! Remember order of Param
		userMonster = new MarshmallowMonster(userName, userEyeCount, userNoseCount, userHairCount, userLegCount, userBellyButton);
	}
	
} 
