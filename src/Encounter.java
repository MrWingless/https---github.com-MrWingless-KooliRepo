// Contains all encounter types - most of these will require separate coding.
public class Encounter {
	public static boolean isInCombat = false;
	
	public static void chooseClass(){
		String[] choices = {"Mage \t(Main attribute: Intelligence)", "Rogue \t(Main attribute Dexterity)", "Warrior \t(Main attribute Strength)"};
		Player.chooseClass(GameFlow.makeChoice("- Please Choose Your Class: -", choices)-1);
		
		Player.displayInfo();
	}
}
