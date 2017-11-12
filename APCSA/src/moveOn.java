import java.util.ArrayList;

import javax.swing.JTextArea;

public class moveOn {
	
	/**
	 * the count for what part of the game you are at to determine the text for the story
	 */
	public static int countContinueOn = -1;
	
	/**
	 * the count for what part of the game you are at to determine the choices available for continuing the story
	 */
	public static int countChoices = 0;
	
	/**
	 * continues on the text of the story based on the choice made and past choices and updates the characters stats
	 * @param pastChoices an array list of the previous choices (with the last element in the array list being the 
	 * choice just chosen) 
	 * @param character your character
	 * @return the text for the next part of the story based on the past choices made
	 */
	public static String continueOn(ArrayList<Integer> pastChoices, MainCharacter character) {
		countContinueOn++;
		if(pastChoices.size() == 0){
			return textChoiceZero.introText();
		} 
		else if(pastChoices.size() == 1) {
			return textChoiceOne.text(pastChoices, character);
		}
		else if(pastChoices.size() == 2) {
			return textChoiceTwo.text(pastChoices, character);
		}else if(pastChoices.size() == 3){
			return textChoiceThree.text(pastChoices,character);
		}else if(pastChoices.size() == 4){
			return textChoiceFour.text(pastChoices,character);
		}else if(pastChoices.size() == 5){
			return textChoiceFive.text(pastChoices,character);
		}
		/* else if(countContinueOn ==2) return textChoiceTwo.text(choice);
		else if(countContinueOn ==3) return textChoiceThree.text(choice);
		else if(countContinueOn ==4) return textChoiceFour.text(choice);
		else if(countContinueOn ==5) return textChoiceFive.text(choice); */
		return null;
	}
	
	/**
	 * tells the game what the new choices are based on pastChoices made and character stats
	 * @param pastChoices the previous choices made, with the last element in this array list being the choice just 
	 * chosen
	 * @param character your character
	 * @return an array of the new choices that should be given to the user
	 */
	public static String[] choiceList(ArrayList<Integer> pastChoices, MainCharacter character) {
		String[] a = new String[4];
		if(pastChoices.size() == 0) {
			a[0] = textChoiceZero.choiceA();
			a[1] = textChoiceZero.choiceB();
			a[2] = textChoiceZero.choiceC();
			a[3] = textChoiceZero.choiceD();
		} else if(pastChoices.size() == 1){
			a[0] = textChoiceOne.choiceA(pastChoices);
			a[1] = textChoiceOne.choiceB(pastChoices);
			a[2] = textChoiceOne.choiceC(pastChoices);
			a[3] = textChoiceOne.choiceD(pastChoices);
		
		} else if(pastChoices.size() == 2){
			a[0] = textChoiceTwo.choiceA(pastChoices);
			a[1] = textChoiceTwo.choiceB(pastChoices);
			a[2] = textChoiceTwo.choiceC(pastChoices);
			a[3] = textChoiceTwo.choiceD(pastChoices);
		
		} else if(pastChoices.size() == 3){
			a[0] = textChoiceThree.choiceA(pastChoices, character);
			a[1] = textChoiceThree.choiceB(pastChoices);
			a[2] = textChoiceThree.choiceC(pastChoices);
			a[3] = textChoiceThree.choiceD(pastChoices);
		} else if(pastChoices.size() == 4){
			a[0] = textChoiceFour.choiceA(pastChoices, character);
			a[1] = textChoiceFour.choiceB(pastChoices);
			a[2] = textChoiceFour.choiceC(pastChoices);
			a[3] = textChoiceFour.choiceD(pastChoices);
		} else if(pastChoices.size() == 5){
			a[0] = textChoiceFive.choiceA(pastChoices, character);
			a[1] = textChoiceFive.choiceB(pastChoices);
			a[2] = textChoiceFive.choiceC(pastChoices);
			a[3] = textChoiceFive.choiceD(pastChoices);
		}
		return a;
	}
	
	
}
