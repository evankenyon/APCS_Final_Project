import java.util.ArrayList;

public class textChoiceTwo extends textChoice{

	/**
	 * it holds the text for the continuation of the game, after you pick your second choice
	 * and updates your characters stats
	 * @param previousChoices the choice you picked
	 * @param character your character
	 * @return the text for the next part of the game based on the the choice you picked
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		String str = null;
		if(previousChoices.get(0) == 1) {
			if(previousChoices.get(1) == 1){
				str = "You panic. Your breathing escalates and you frantically look around the room. Holy sh*t!!!"
						+ "	Before your brain has the time to process anything, you hear a voice come from the doorway."
						+ " \"What are you doing in here, hon-- What the h*ll?!\" Your wife stares at you in horror as she sees the weapon in your hands. \"Where did you get that?!\""
						+ "	You nervously set the weapon down on the table and try to keep on a straight face. \"Oh"
						+ " this?\" You try your best to sound dismissive. If being in a gang taught you anything, it was how to lie on the spot. \"I've had this for forever. It belonged to some other family member. It's just something we like to keep in the family through the generations for history's sake. I thought I showed this to you before?\""
						+ "	Your wife frowns and keeps a disappointed look on her face, though she appears to believe you. \"You know how I feel about violence \""
						+ "	\"It's just for history's sake,\" you repeated."
						+ "	Your wife nodded, but her face didn't change. \"Well, just don't bring it in the house. And don't let the kids touch it either. You hear me?\""
						+ "	There is a moment of silence before you finally speak up. \"Look, I have to leave for work soon, dear. We can talk about this later.\""
						+ "	Before your wife has time to reply you pick up your toolbox and the weapon and head towards your car."
						+ "	\"Where are you taking those things?\" You hear your wife ask, but you don't reply. How could you be so dumb as to let your wife see your weapon? This will certainly cause a fight later on. Oh well, that's something you'll have to think about later. Now, onto more important things. Like, what are you going to do for work today?";
			}
			else if(previousChoices.get(1) == 2) {
				str = "In a panic, you try to stick the rifle into your coat, but you quickly realize that the gun is too big to fit. Before you have time to try anything else, you hear a voice from the doorway."
						+ "	\"What are you doing in here, hon-- What the h*ll?!\" Your wife stares at you in horror as she sees the weapon in your hands. \"Where did you get that?!\""
						+ "	You nervously set the weapon down on the table and try to keep on a straight face. \"Oh this?\" You try your best to sound dismissive. If being in a gang taught you anything, it was how to lie on the spot. \"I've had this for forever. It belonged to some other family member. It's just something we like to keep in the family through the generations for history's sake. I thought I showed this to you before?\""
						+ "	Your wife frowns and keeps a disappointed look on her face, though she appears to believe you. \"You know how I feel about violence \""
						+ "	\"It's just for history's sake,\" you repeated."
						+ "	Your wife nodded, but her face didn't change. \"Well, just don't bring it in the house. And don't let the kids touch it either. You hear me?\""
						+ "	There is a moment of silence before you finally speak up. \"Look, I have to leave for work soon, dear. We can talk about this later.\""
						+ "	Before your wife has time to reply you pick up your toolbox and the weapon and head towards your car."
						+ "	\"Where are you taking those things?\" You hear your wife ask, but you don't reply. How could you be so dumb as to let your wife see your weapon? This will certainly cause a fight later on. Oh well, that's something you'll have to think about later. Now, onto more important things. Like, what are you going to do for work today?"
						+ "";
			}
			else if(previousChoices.get(1) == 3) {
				character.setAmmo(character.getAmmo() - 1);
				str = "You cannot let yourself get caught!"
						+ "	With expert speed, you load up the gun and point it towards the door. The moment it creaks open, you fire. A loud blast is heard followed by the sounds of a high-pitched shriek. Suddenly, you see your wife's body collapse on the floor. "
						+ "You hear children crying and screaming from inside the house."
						+ "	\"What's happening?! What was that?!\" They cry as you hear them run towards the garage. Oh f*ck, oh f*ck, oh f*ck -- What have you done?! Your wife, the love of your life! Without even thinking, you run to your wife's side and scoop her up into her arms. You began to cry so loudly that you barely heard your daughter shriek as she entered the room. \"Daddy! Daddy! What did you do?!\""
						+ "		"
						+ "	Game Over.";
			}
			else if(previousChoices.get(1) == 4) {
				str = "You can't let yourself get caught!"
						+ "	Quickly, you throw your weapon back into the toolbox and close it. Right as the toolbox's lock clicks into place, your hear your wife's voice from the doorway."
						+ "	\"Honey, what are you doing in the garage first thing in the morning?\""
						+ "	\"Sorry honey, I was just looking for some tools, I was thinking about building something in my workshop today\""
						+ "	\"Oh, okay. Be safe!\" She reenters the house and closes the door behind her."
						+ "	Okay, that was close. Good thing you didn't attack the intruder. You now have to decide what to do today. "
						+ "";
			}
		}
		else if(previousChoices.get(0) == 2) {
			if(previousChoices.get(1) == 1){
				str = "You panic. Your breathing escalates and you frantically look around the room. Holy sh*t!!!"
						+ "	Before your brain has the time to process anything, you hear a voice come from the doorway."
						+ "	\"What are you doing in here, hon-- What the h*ll?!\" Your wife stares at you in horror as she sees the weapon in your hands. \"Where did you get that?!\""
						+ "	You nervously set the weapon down on the table and try to keep on a straight face. \"Oh this?\" You try your best to sound dismissive. If being in a gang taught you anything, it was how to lie on the spot. \"I've had this for forever. It belonged to some other family member. It's just something we like to keep in the family through the generations for history's sake. I thought I showed this to you before?\""
						+ "	Your wife frowns and keeps a disappointed look on her face, though she appears to believe you. \"You know how I feel about violence \""
						+ "	\"It's just for history's sake,\" you repeated."
						+ "	Your wife nodded, but her face didn't change. \"Well, just don't bring it in the house. And don't let the kids touch it either. You hear me?\""
						+ "	There is a moment of silence before you finally speak up. \"Look, I have to leave for work soon, dear. We can talk about this later.\""
						+ "	Before your wife has time to reply you pick up your toolbox and the weapon and head towards your car."
						+ "	\"Where are you taking those things?\" You hear your wife ask, but you don't reply. How could you be so dumb as to let your wife see your weapon? This will certainly cause a fight later on. Oh well, that's something you'll have to think about later. Now, onto more important things. Like, what are you going to do for work today?"
						+ "";
			}
			else if(previousChoices.get(1) == 2) {
				str = "You can't let yourself get caught! Quickly, you throw your weapon back into the toolbox and close it. Right as the toolbox's lock clicks into place, your hear your wife's voice from the doorway."
						+ "	\"Honey, what are you doing in the garage first thing in the morning?\""
						+ "	\"Sorry honey, I was just looking for some tools, I was thinking about building something in my workshop today\""
						+ "	\"Oh, okay. Be safe!\" She reenters the house and closes the door behind her."
						+ "	Okay, that was close. Good thing you didn't attack the intruder. You now have to decide what to do today. "
						+ "";
			}
			else if(previousChoices.get(1) == 3) {
				character.setAmmo(character.getAmmo() - 1);
				str = "You cannot let yourself get caught! With expert speed, you load up the gun and point it towards the door. The moment it creaks open, you fire. A loud blast is heard followed by the sounds of a high-pitched shriek."
						+ "	Suddenly, you see your wife's body collapse on the floor. You hear children crying and screaming from inside the house. \"What's happening?! What was that?!\" They cry as you hear them run towards the garage."
						+ "	Oh f*ck, oh f*ck, oh f*ck -- What have you done?! Your wife, the love of your life! Without even thinking, you run to your wife's side and scoop her up into her arms. You began to cry so loudly that you barely heard your daughter shriek as she entered the room. \"Daddy! Daddy! What did you do?!\""
						+ "		"
						+ "	Game Over.";
			}
		}
		else if(previousChoices.get(0) == 3) {
			if(previousChoices.get(1) == 1){
				str = "You panic. Your breathing escalates and you frantically look around the room. Holy sh*t!!!"
						+ "	Before your brain has the time to process anything, you hear a voice come from the doorway."
						+ "	\"What are you doing in here, hon-- What the hell?!\" Your wife stares at you in horror as she sees the weapon in your hands. \"Where did you get that?!\""
						+ "	You nervously set the weapon down on the table and try to keep on a straight face. \"Oh this?\" You try your best to sound dismissive. If being in a gang taught you anything, it was how to lie on the spot. I've had this for forever. It belonged to some other family member. It's just something we like to keep in the family through the generations for history's sake. I thought I showed this to you before?\""
						+ "	Your wife frowns and keeps a disappointed look on her face, though she appears to believe you. \"You know how I feel about violence \""
						+ "	\"It's just for history's sake,\" you repeated."
						+ "	Your wife nodded, but her face didn't change. \"Well, just don't bring it in the house. And don't let the kids touch it either. You hear me?\""
						+ "	There is a moment of silence before you finally speak up. \"Look, I have to leave for work soon, dear. We can talk about this later.\""
						+ "	Before your wife has time to reply you pick up your toolbox and the weapon and head towards your car."
						+ "	\"Where are you taking those things?\" You hear your wife ask, but you don't reply. How could you be so dumb as to let your wife see your weapon? This will certainly cause a fight later on. Oh well, that's something you'll have to think about later. Now, onto more important things. Like, what are you going to do for work today?"
						+ "";
			}
			else if(previousChoices.get(1) == 2) {
				str = "You can't let yourself get caught! Quickly, you throw your weapon back into the toolbox and close it. Right as the toolbox's lock clicks into place, your hear your wife's voice from the doorway."
						+ "	\"Honey, what are you doing in the garage first thing in the morning?\""
						+ "	\"Sorry honey, I was just looking for some tools, I was thinking about building something in my workshop today\""
						+ "	\"Oh, okay. Be safe!\" She reenters the house and closes the door behind her."
						+ "	Okay, that was close. Good thing you didn't attack the intruder. You now have to decide what to do today. ";
			}
			else if(previousChoices.get(1) == 3) {
				str = "You cannot let yourself get caught! With expert speed, you run towards the door and lean against the wall next to it. The moment it creaks open, you jump at the intruder and began to swing your arm fiercely. You barely process the intruder's face as you continue to aim for their chest. You only break out of your trance when you hear their high-pitched shriek."
						+ "	Suddenly, you see your wife's body collapse on the floor. You hear children crying and screaming from inside the house. \"What's happening?! What was that?!\" They cry as you hear them run towards the garage. Oh f*ck, oh f*ck, oh f*ck -- What have you done?! Your wife, the love of your life! Without even thinking, you reach for your wife's body and scoop her up into her arms. You began to cry so loudly that you barely heard your daughter shriek as she entered the room. \"Daddy! Daddy! What did you do?!\""
						+ "		"
						+ "	Game Over";
			}
		}
		else {
			if(previousChoices.get(1) == 1){
				character.setWeapon("handgun");
				character.setAmmo(11);
				str = "You cannot let yourself get caught with your toolbox! With expert speed, you load up one of your guns and point it towards the door. The moment it creaks open, you fire. A loud blast is heard followed by the sounds of a high-pitched shriek."
						+ "	Suddenly, you see your wife's body collapse on the floor. You hear children crying and screaming from inside the house. \"What's happening?! What was that?!\" They cry as you hear them run towards the garage. Oh f*ck, oh f*ck, oh f*ck -- What have you done?! Your wife, the love of your life! Without even thinking, you run to your wife's side and scoop her up into her arms. You began to cry so loudly that you barely heard your daughter shriek as she entered the room. \"Daddy! Daddy! What did you do?!\""
						+ "		"
						+ "	Game Over.";
			}
			else if(previousChoices.get(1) == 2) {
				str = "The doorknob slowly turns. Your wife walks out. "
						+ "	\"Honey, what are you doing in the garage first thing in the morning?\""
						+ "	\"Sorry honey, I was just looking for some tools, I was thinking about building something in my workshop today\""
						+ "	\"Oh, okay. Be safe!\" She reenters the house and closes the door behind her."
						+ "	Okay, that was close. Good thing you didn't attack the intruder. You now have to decide what to do today. "
						+ "";
			}
		}
		return str;
	}
	
	
	/**
	 * holds the string for the 3rd choice A in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 3rd choice A of the game based on previousChoices 
	 */
	public static String choiceA(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(0) == 4 && previousChoices.get(1) == 1) return null;
			if(previousChoices.get(previousChoices.size() -1) == 1 || previousChoices.get(previousChoices.size() -1) == 2 || previousChoices.get(previousChoices.size() -1) == 4){
				String a = "Drug Hustling";
				return a;
			}
		return null;
	}
	
	/**
	 * holds the string for the 3rd choice B in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 3rd choice B of the game based on previousChoices 
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(0) == 4 && previousChoices.get(1) == 1) return null;
		if(previousChoices.get(previousChoices.size() -1) == 1 || previousChoices.get(previousChoices.size() -1) == 2 || previousChoices.get(previousChoices.size() -1) == 4)  {
			String b = "Gain enemy territory";
			return b;
		}
		return null;
	}
		
	/**
	 * holds the string for the 3rd choice C in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 3rd choice C of the game based on previousChoices 
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(0) == 4 && previousChoices.get(1) == 1) return null;
		String c = null;
		if(previousChoices.get(previousChoices.size() -1) != 3) {
			c = "Stay home";
			
		}
		return c;
	}
	/**
	 * holds the string for the 3rd choice D in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 3rd choice D of the game based on previousChoices 
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(0) == 4 && previousChoices.get(1) == 1) return null;
		if(previousChoices.get(previousChoices.size() -1) != 3) {
			String d = "Go out on the town";
			return d;
		}
		else {
			return null;
		}
	}
}
