import java.util.ArrayList;

public abstract class textChoice{
	
	/**
	 * a method which updates the text of the story and character stats based upon past choices made and character stats
	 * @param previousChoices the past choices made by the user
	 * @param character the character of the user
	 * @return returns the text that will display for the continuation of the story
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		return null;
	}
	
	/**
	 * a method which updates the choice A text based upon past choices made and character stats
	 * @param previousChoices previous choices made
	 * @param character the user's character
	 * @return the string which will be displayed for the new choice A
	 */
	public static String choiceA(ArrayList<Integer> previousChoices, MainCharacter character) {
		return null;
	}
	
	/**
	 * a method which updates the choice B text based upon past choices made
	 * @param previousChoices previous choices made
	 * @param character the user's character
	 * @return the string which will be displayed for the new choice B
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		return null;
	}
	
	/**
	 * a method which updates the choice C text based upon past choices made 
	 * @param previousChoices previous choices made
	 * @param character the user's character
	 * @return the string which will be displayed for the new choice C
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		return null;
	}
	
	/**
	 * a method which updates the choice D text based upon past choices made 
	 * @param previousChoices previous choices made
	 * @param character the user's character
	 * @return the string which will be displayed for the new choice D
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		return null;
	}
}
