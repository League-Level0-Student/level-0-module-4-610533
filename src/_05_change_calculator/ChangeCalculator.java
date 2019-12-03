package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickels = JOptionPane.showInputDialog("How many SHECKELS (Nickels) do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickel = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("HOW MANY DIMES DO YOU HAVE?!");
		int dime = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have...?");
		int quarter = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
		double Calculation = (quarter*25)+(dime*10)+(nickel*5);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + Calculation + "cents!");
	}
}

