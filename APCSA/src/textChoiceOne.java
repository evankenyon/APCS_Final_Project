import java.util.ArrayList;

public class textChoiceOne extends textChoice{

	/**
	 * contains the text for the continuation of the story based on past choices and updates character stats
	 * @param previousChoices the past choices made 
	 * @param character your character
	 * @return the text for the story's continuation
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		String str;
		if(previousChoices.get(0) == 1) {
			character.setWeapon("rifle");
			character.setAmmo(30);
			 str = "You pick up the rifle. You turn the weapon in your hand, careful to keep it pointed towards "
			 		+ "the ground. You remember when you first got this one. You were scared to pick it up at first. "
			 		+ "You were even more scared to shoot it. You sighed heavily as the memories came flooding back, "
			 		+ "but your thoughts were broken by the sound of footsteps coming from inside the house. Soon "
			 		+ "you heard the quiet click of the garage doorknob turning. Shit!";
		}
		else if(previousChoices.get(0) == 2) {
			character.setWeapon("handgun");
			character.setAmmo(12);
			str = "You pick up the handgun. You turn the weapon in your hand, careful to keep it pointed towards the"
					+ " ground. This one was new to the collection. You only used it on one mission, and you never got"
					+ " the chance to shoot it. You snickered. It was a rare occurrence for you to go through an"
					+ " entire mission without having to shoot at something, but it seems you were lucky that day."
					+ " You sighed heavily as the memories came flooding back, but your thoughts were broken by the"
					+ " sound of footsteps coming from inside the house. Soon you heard the quiet click of the garage "
					+ "doorknob turning. Shit!";
		}
		else if(previousChoices.get(0) == 3) {
			character.setWeapon("knife");
			str = "You pick up the pocket knife. You turn the weapon in your hand, paying attention to the slight"
					+ " rust that clung to its edges. This weapon was different. Your uncle gave you this one that one"
					+ " time you went camping together. Back then you only used it to cut through ropes and low-hanging"
					+ " branches. Thinking back, it was probably irresponsible for your uncle to give you this to you"
					+ " at all. Then again, your uncle was always a bit of a nut. You sighed heavily as the memories"
					+ " came flooding back, but your thoughts were broken by the sound of footsteps coming from inside"
					+ " the house. Soon you heard the quiet click of the garage doorknob turning. Shit!";
		} 
		else {
			str = "You stare into your toolbox and then close it. You question why you came to pick up a weapon and"
					+ " did not end up picking one. You sighed heavily, but your thoughts were broken by the sound of"
					+ " footsteps coming from inside the house. Soon you heard the quiet click of the garage doorknob"
					+ " turning. Oh?";
		}
		return str;
	}
	
	/**
	 * holds the string for the 2nd choice A in the game (based upon past choices)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 2nd choice A of the game based on previousChoices 
	 */
	public static String choiceA(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) == 1) {
			String a = "Panic";
			return a;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 2) {
			String a = "Panic";
			return a;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 3) {
			String a = "Panic";
			return a;
		}
		else {
			String a = "Grab weapon to attack intruder";
			return a;
		}
	}
	
	/**
	 * holds the string for the 2nd choice B in the game (based upon past choices)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 2nd choice B of the game based on previousChoices 
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) == 1) {
			String b = "Try to hide weapon in your coat";
			return b;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 2) {
			String b = "Try to hide your weapon";
			return b;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 3) {
			String b = "Try to hide your weapon";
			return b;
		}
		else {
			String b = "Do nothing";
			return b;
		}
		
	}
		
	/**
	 * holds the string for the 2nd choice C in the game (based upon past choices)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 2nd choice C of the game based on previousChoices 
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) ==1) {
			String c = "Shoot the intruder";
			return c;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 2){
			String c = "Shoot the intruder";
			return c;
		}
		else if(previousChoices.get(previousChoices.size() -1) == 3){
			String c = "Stab the intruder";
			return c;
		} else {
			return null;
		}
	}
		
	/**
	 * holds the string for the 2nd choice D in the game (based upon past choices)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 2nd choice D of the game based on previousChoices 
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) == 1) {
			String d = "Try to hide weapon back in the toolbox";
			return d;
		}
		else {
			return null;
		}
	}
}
