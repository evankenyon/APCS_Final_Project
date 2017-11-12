import java.util.ArrayList;

public class textChoiceFive extends textChoice {

	/**
	 * it holds the text for the continuation of the game after you pick your fifth choice
	 * and updates your characters stats and bases some of the text off of your character stats
	 * @param previousChoices the choice you picked
	 * @param character your character
	 * @return the text for the next part of the game based on the the choice you picked
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		String str = null;
		
			if(previousChoices.get(4) == 2){
				if(character.willWin(previousChoices) == true){
					if(character.getWeapon().equals("handgun")) character.setHealth(character.getHealth() -15);
					if(character.getWeapon().equals("rifle")) character.setHealth(character.getHealth() - 5);
					if(character.getWeapon().equals("none")) character.setHealth(character.getHealth() - 30);
					if(character.getWeapon().equals("knife")) character.setHealth(character.getHealth() - 20);
					character.setAmmo(character.getAmmo() - 5);
				str = "Now was the time for action! You leap out from your hiding spot and charge. Everything became a blur."
						+ " Voices shouted, punches were thrown, and you could have sworn a few bullets flew. And then, "
						+ "there was silence."
						+ "	You look around, debating whether or not any of that actually happened. Then, "
						+ "you saw it. The leader of the Crips was on the ground, bleeding. You walked over to his body and "
						+ "tapped it with your foot. Dead as dust. You look over and see that his henchmen are knocked out "
						+ "as well. Wow. How did you manage to do that on your own? You look down at the weapon in your "
						+ "hand. Well, what's done is done. "
						+ "	You sneak around the building and are surprised to find that "
						+ "it is mostly empty. You grab a few supplies you find, but you mostly leave things as they are. "
						+ "You might want to get out of here. You didn't realize it before, but it was actually getting "
						+ "rather late. You spent most of the day lurking about in enemy territory and it made you lose "
						+ "track of time. You head home. You take a stop at a Bloods hangout to clean off the blood and you "
						+ "go to pick up your car, but within a few hours you are back in your own garage. "
						+ "	Your wife pops "
						+ "up in the doorway. \"Hey, honey!\" she calls. \"How was your day?\" You smile at her. \"Same old, "
						+ "same old.\""
						+ "		The End";
				}else{
					character.setHealth(0);
					character.setAmmo(character.getAmmo() - 2);
					str = "Now was the time for action! You leap out from your hiding spot and charge. Everything became a blur. "
							+ "Voices shouted, punches were thrown, and you have sworn a few bullets flew. And then, there was "
							+ "silence. "
							+ "	You looked around a saw that the two henchmen were lying on the ground. But, where was "
							+ "the Crips leader? You turn around to see --- "
							+ "	And it all went black. "
							+ "		Game Over.";
				}
			}
			else if(previousChoices.get(4) == 1) {
				if(character.willWin(previousChoices) == true){
					if(character.getWeapon().equals("handgun")) character.setHealth(character.getHealth() -15);
					if(character.getWeapon().equals("rifle")) character.setHealth(character.getHealth() - 5);
					if(character.getWeapon().equals("none")) character.setHealth(character.getHealth() - 30);
					if(character.getWeapon().equals("knife")) character.setHealth(character.getHealth() - 20);
					
					character.setAmmo(character.getAmmo() - 5);
				str = "You have to get away! You quickly scurry out from the desk and try to dart back to the air vent. "
						+ "	\"Hey!\" "
						+ "you hear a voice shout from behind you. \"Stop right there!\" You feel something grab your back. Guess "
						+ "you have no choice now. "
						+ "	You leap up to attack. Everything became a blur. Voices shouted, punches were "
						+ "thrown, and you could have sworn a few bullets flew. And then, there was silence. You look around, debating "
						+ "whether or not any of that actually happened. Then, you saw it. The leader of the Crips was on the ground, "
						+ "bleeding. You walked over to his body and tapped it with your foot. Dead as dust. You look over and see "
						+ "that his henchmen are knocked out as well. Wow. How did you manage to do that on your own? You look down "
						+ "at the weapon in your hand. Well, what's done is done. "
						+ "	You sneak around the building and are surprised "
						+ "to find that it is mostly empty. You grab a few supplies you find, but you mostly leave things as they "
						+ "are. You might want to get out of here. You didn't realize it before, but it was actually getting rather "
						+ "late. You spent most of the day lurking about in enemy territory and it made you lose track of time. You "
						+ "head home. You take a stop at a Bloods hangout to clean off the blood and you go to pick up your car, but "
						+ "within a few hours you are back in your own garage. "
						+ "	Your wife pops up in the doorway. \"Hey, honey!\" she "
						+ "calls. \"How was your day?\" You smile at her. \"Same old, same old.\""
						+ "		The End";
				}else{
					character.setHealth(0);
					character.setAmmo(character.getAmmo() - 2);
					str = "You have to get away! You quickly scurry out from the desk and try to dart back to the air vent."
							+ "\"Hey!\" "
							+ "you hear a voice shout from behind you. \"Stop right there!\" You feel something grab your back. Guess "
							+ "you have no choice now. "
							+ "	You leap up to attack. Everything became a blur. Voices shouted, punches were "
							+ "thrown, and you have sworn a few bullets flew. And then, there was silence. You looked around a saw "
							+ "that the two henchmen were lying on the ground. But, where was the Crips leader? You turn around to "
							+ "see --- "
							+ "	And it all turns black. "
							+ "		Game Over.";
				}
			}
			
		return str;
	}
	
	
	/**
	 * holds the string for the 6th choice A in the game 
	 * @param previousChoices an array list of previous choices 
	 * @return	the 6th choice A of the game based on previousChoices 
	 */
	public static String choiceA(ArrayList<Integer> previousChoices, MainCharacter character) {
		return null;
	}
	
	/**
	 * holds the string for the 6th choice B in the game
	 * @param previousChoices an array list of previous choices 
	 * @return	the 6th choice B of the game based on previousChoices 
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		return null;
}
		
	/**
	 * holds the string for the 6th choice C in the game
	 * @param previousChoices an array list of previous choices 
	 * @return	the 6th choice C of the game based on previousChoices 
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		return null;
}
		
	/**
	 * holds the string for the 6th choice D in the game
	 * @param previousChoices an array list of previous choices 
	 * @return	the 6th choice D of the game based on previousChoices 
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		return null;
	}
}