import java.util.ArrayList;

public class textChoiceFour extends textChoice{

	/**
	 * it holds the text for the continuation of the game, after you pick your fourth choice
	 * and updates your characters stats and bases some of the text off of your character stats
	 * @param previousChoices the choice you picked
	 * @param character your character
	 * @return the text for the next part of the game based on the the choice you picked
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		String str = null;
		if(previousChoices.get(2) == 1) {
			if(previousChoices.get(3) == 1){
				if(character.willWin(previousChoices) == true){
				if(character.getWeapon().equals("handgun") || character.getWeapon().equals("rifle")) character.setAmmo(character.getAmmo() - 5);
				character.setHealth(character.getHealth() - 10);
				str = "Now was the time for action! You leap out from your hiding spot and charge. Everything became a blur."
						+ " Voices shouted, punches were thrown, and you could have sworn a few bullets flew. And then, "
						+ "there was silence."
						+ "	You look around, debating whether or not any of that actually happened. Then, "
						+ "you saw it. The leader of the Crips was on the ground, bleeding. You walked over to his body and "
						+ "tapped it with your foot. Dead as dust. You look over and see that his henchmen are knocked out "
						+ "as well. Wow. How did you manage to do that on your own? You look down at the weapon in your "
						+ "hand. Well , what's done is done. "
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
					character.setAmmo(character.getAmmo() -2);
					str = "Now was the time for action! You leap out from your hiding spot and charge. Everything became a blur. "
							+ "Voices shouted, punches were thrown, and you have sworn a few bullets flew. And then, there was "
							+ "silence. "
							+ "	You looked around a saw that the two henchmen were lying on the ground. But, where was "
							+ "the Crips leader? You turn around to see --- "
							+ "	And it all went black. "
							+ "		Game Over.";
				}
			}
			else if(previousChoices.get(3) == 2) {
				if(character.willWin(previousChoices) == true){
					if(character.getWeapon().equals("handgun")) character.setHealth(character.getHealth() -15);
					if(character.getWeapon().equals("rifle")) character.setHealth(character.getHealth() - 5);
					if(character.getWeapon().equals("none")) character.setHealth(character.getHealth() - 30);
					if(character.getWeapon().equals("knife")) character.setHealth(character.getHealth() - 20);
					character.setAmmo(character.getAmmo() -5);
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
		}
		else if(previousChoices.get(2) == 2) {
			if(previousChoices.get(3) == 1){
				str = "It's probably best if you go for their supplies. It's like killing two birds with one stones -- you get to "
						+ "weaken their side while gaining resources for your own. "
						+ "	With that decided, you pull a hood over your "
						+ "head and march down to the south side. The place wasn't hard to find. The street leading up to it was "
						+ "filled with beat-up buildings with boarded windows and graffiti-filled walls. The actual storage place "
						+ "was one of the smaller buildings that almost disappeared under the amount of graffiti written all over "
						+ "it. A little sign hung in the window reading \"Jack's Coffee Shop\". "
						+ "	You had to be careful here. "
						+ "If anyone spotted you here, you'd be dead. You continued to lurk in the shadows, moving carefully "
						+ "between each of the buildings. It was eerie how quiet this area was. By the time you are in the "
						+ "alleyway next to the storage place, you hear voices coming from the inside. They are too muffled to "
						+ "make out, but they still put you on edge. You try to control your breathing as you feel your heart "
						+ "racing. You approach one of the air vents near the edge of the building. Just big enough for you to "
						+ "fit. The screws were rusty enough that it didn't take much for you to open it. You slip in and before "
						+ "you knew it, you were inside the building. You were in some back office area. Before you could do "
						+ "anything else, you heard the sound of footsteps approaching. Hide! You ducked under the desk and "
						+ "watched as three men entered the room. You tried to hold your breath as you saw their faces. Two of the "
						+ "faces were new and unfamiliar, but the third one, you'd recognize the Crips' leader anywhere. "
						+ "	What "
						+ "should you do now?";
			}
			else if(previousChoices.get(3) == 2) {
				if(!(character.getWeapon().equals("None"))){
					if(character.getWeapon().equals("handgun")) character.setHealth(character.getHealth() -10);
					if(character.getWeapon().equals("rifle")) character.setHealth(character.getHealth() - 5);
					if(character.getWeapon().equals("none")) character.setHealth(character.getHealth() - 20);
					if(character.getWeapon().equals("knife")) character.setHealth(character.getHealth() - 15);
				str = "Look, you're pissed. Your gang is broke, your life is constantly in danger, and you're just flat-out tired "
						+ "of this. What's the point of being in a gang if you have to lurk in the shadows all the time? You need "
						+ "some blood. "
						+ "	With that in mind, you head out to the south side. You keep your head hung low until you "
						+ "reach the street you were looking for. It looked like your stereotypical gang neighborhood. All the "
						+ "buildings blended into each other with their smashed windows and graffitied walls. The sound of sirens "
						+ "always lingered in the distance, though not even the police would dare enter this area. You leaned "
						+ "against the wall of the nearest building and kept an eye open for any potential targets. There were "
						+ "a few guys in the distance tossing stones into one of the buildings. Each had a blue bandana hanging "
						+ "out of his pocket. Crips. Perfect. You approached them slowly and quietly. They men didn't even notice "
						+ "you until you were a few feet away. "
						+ "	\"Hey, whatcha doing here?\" one called out. They all began to swarm "
						+ "around you like vultures. "
						+ "	\"Who are you? Whatcha want?\" another one taunted. You stood their silently. "
						+ "You could see their faces change from one of amusement to one of annoyance. "
						+ "	\"What? Too scared to talk?\" "
						+ "the third one asked. You feel the weapon in your coat. Good thing you grabbed this one "
						+ "today. The moment you saw one of the three men approach you, you wipe out your gun. One shot, two shot, "
						+ "three-- you feel a blow to the back of your head. "
						+ "	Dammit! From the ground, you saw that you hit the "
						+ "first two. The third one however -- You yelped in pain as you felt a kick to your side. Dang, it was "
						+ "probably dumb to go three on one. You heard the third guy yell at you with each blow, but it was hard "
						+ "to make out his words. "
						+ "	You had to focus on what to do next. You began"
						+ " to hear other voices in the distance -- probably people who heard the fight and were coming to see "
						+ "what was going on. You had to run. Without wasting a second, you get up and dart away. You hear gunfire "
						+ "in the distance, but you ignore it. You let your legs carry you further and further until you are out "
						+ "of breath. You quickly throw yourself into a back alley next to a building labelled \"Jack's Coffee "
						+ "Shop\". You hear the voices following you. You slip into one of the loose air vents in order to avoid "
						+ "detection. You soon find yourself inside a small office area. Before you could do anything else, you "
						+ "heard the sound of footsteps approaching. Hide! You ducked under the desk and watched as three men "
						+ "entered the room.  You tried to hold your breath as you saw their faces. Two of the faces were new and unfamiliar, but the third one… "
						+ "You’d recognize the Crips’ leader anywhere. What should you do now?";
				}else{
					if(character.getWeapon().equals("handgun")) character.setHealth(character.getHealth() -10);
					if(character.getWeapon().equals("rifle")) character.setHealth(character.getHealth() - 5);
					if(character.getWeapon().equals("none")) character.setHealth(character.getHealth() - 20);
					if(character.getWeapon().equals("knife")) character.setHealth(character.getHealth() - 15);
					str = "Look, you're pissed. Your gang is broke, your life is constantly in danger, and you're just flat-out tired "
						+ "of this. What's the point of being in a gang if you have to lurk in the shadows all the time? You need "
						+ "some blood. "
						+ "	With that in mind, you head out to the south side. You keep your head hung low until you "
						+ "reach the street you were looking for. It looked like your stereotypical gang neighborhood. All the "
						+ "buildings blended into each other with their smashed windows and graffitied walls. The sound of sirens "
						+ "always lingered in the distance, though not even the police would dare enter this area. You leaned "
						+ "against the wall of the nearest building and kept an eye open for any potential targets. There were "
						+ "a few guys in the distance tossing stones into one of the buildings. Each had a blue bandana hanging "
						+ "out of his pocket. Crips. Perfect. You approached them slowly and quietly. They men didn�t even notice "
						+ "you until you were a few feet away. "
						+ "	\"Hey, whatcha doing here?\" one called out. They all began to swarm "
						+ "around you like vultures. "
						+ "	\"Who are you? Whatcha want?\" another one taunted. You stood their silently. "
						+ "You could see their faces change from one of amusement to one of annoyance. "
						+ "	\"What? Too scared to talk?\" "
						+ "the third one asked."
						+ "	You look between the three men. As soon as one "
						+ "approaches you, you punch him right between the eyes. He looks dazed for a moment, but it isn't long "
						+ "before the other two men jump on you. You fight them off the best you can, but for every one punch you "
						+ "land on them, they land three punches on you. Soon, you find yourself knocked to the ground. Ouch -- "
						+ "This was a bad idea. But, it's too late for that now."
						+ "	You had to focus on what to do next. You began"
						+ " to hear other voices in the distance -- probably people who heard the fight and were coming to see "
						+ "what was going on. You had to run. Without wasting a second, you get up and dart away. You hear gunfire "
						+ "in the distance, but you ignore it. You let your legs carry you further and further until you are out "
						+ "of breath. You quickly throw yourself into a back alley next to a building labelled \"Jack's Coffee "
						+ "Shop\". You hear the voices following you. You slip into one of the loose air vents in order to avoid "
						+ "detection. You soon find yourself inside a small office area. Before you could do anything else, you "
						+ "heard the sound of footsteps approaching. Hide! You ducked under the desk and watched as three men "
						+ "entered the room.  You tried to hold your breath as you saw their faces. Two of the faces were new and unfamiliar, but the third one… "
						+ "You’d recognize the Crips’ leader anywhere. What should you do now?";
				}
			}
			else if(previousChoices.get(3) == 3) {
				character.setAmmo(character.getAmmo() - 1);
				str = "You're tired of this game. You're tired of constantly avoiding each other, only postponing the inevitable "
						+ "conclusion where the two of you face off. It's time you take this guy head on and finish him for good. "
						+ "	With that decided, you make your way down to the south side. It doesn't take you long to figure out where "
						+ "the Crips leader must be hiding. There were Crips members lurking all over the place near his hangout "
						+ "and despite the rest of the city being dead silent, there were constantly people running in and out of his "
						+ "place. So much for secrecy. You begin to lurk in the shadows, approaching the building slowly. With so "
						+ "many people moving about, you doubt anyone would notice you. "
						+ "	By the time you were a few yards away from "
						+ "the building, you saw him. Walking out of the building with two guards nearby was the Crips leader himself, "
						+ "you'd recognize his face anywhere. For a moment, you considered attacking him then and there, but he soon "
						+ "disappeared into a car that was parked outside. Where was he going? You couldn't let him get away. "
						+ "	To the "
						+ "best of your ability, you tried to follow the car without being seen. You lost it a few times, but "
						+ "eventually you were able to track it down to an old building that had a small sign in the window -- "
						+ "\"Jack's Coffee Shop,\" it read. The building looked like it had been abandoned for years, though. You "
						+ "snuck into the alleyway that was next door as you heard voices rise up from inside. You had to get it. "
						+ "You found an air vent on the side of the building, and with surprisingly little effort, you were able to "
						+ "remove the rusty screws and crawl through. Before you knew it, you were inside the building. You were in "
						+ "some back office area. Before you could do anything else, you heard the sound of footsteps approaching. "
						+ "Hide! You ducked under the desk and watched as three men entered the room. You tried to hold your breath "
						+ "as you saw their faces. Two of the faces were new and unfamiliar, but the third one -- You'd recognize the "
						+ "Crips' leader anywhere. What should you do now?.";
			}
		}
		else if(previousChoices.get(2) == 4) {
			if(previousChoices.get(3) == 1){
				if(character.getWeapon().equals("None")){
				character.setHealth(character.getHealth()-50);
				str = "You have to teach these guys a lesson. "
						+ "	You leap from your hiding spot charge at them. Within moments, fists are flying and "
						+ "the two Crips fall to the ground. You grab your arm in pain. Dang, you should have had a weapon. "
						+ "You turn your attention to the figure lying on the ground. To your surprise, he was one of your own. "
						+ "A fellow Blood. You go over and help him off the floor. "
						+ "	\"What was going on here?\" you question. The other "
						+ "Blood looks at the two guys on the ground, his body was all bruised up. "
						+ "	\"I-I was chased all the way up here "
						+ "by the Crips. I was trying to find out where their leader was hiding, but they caught me,\" he began. \"Did you "
						+ "find him?\" you asked. The guy nodded and pulled out a crumpled map. \"He hangs out near this small building "
						+ "called 'Jack's Coffee Shop'. It used to be a coffee shop in the south side, but now it's like a storage place "
						+ "where they keep their guns.\" Suddenly, you hear the sound of sirens in the distance. Crap! Someone must have "
						+ "called the police during the fight. "
						+ "	You feel a tug on your sleeve and you turn to see the other Blood pulling "
						+ "you towards the back of the alley. \"There's a manhole we can escape through. Let's get outta here.\" Within a "
						+ "few minutes, the two of your reemerged in a different area of the city. The other Bloods member left the scene "
						+ "almost instantly. It didn't matter though, you knew where you needed to go. Using the map, you headed towards "
						+ "the south side. "
						+ "	Eventually you found yourself outside of Jack's Coffee Shop. You found an air vent on the side "
						+ "of the building, and with surprisingly little effort, you were able to remove the rusty screws and crawl "
						+ "through. Before you knew it, you were inside the building. You were in some back office area. Before you could "
						+ "do anything else, you heard the sound of footsteps approaching. Hide! You ducked under the desk and watched as "
						+ "three men entered the room. You tried to hold your breath as you saw their faces. Two of the faces were new and "
						+ "unfamiliar, but the third one -- You'd recognize the Crips' leader anywhere. What should you do now?";
				}
				else{
					character.setHealth(character.getHealth() - 5);
					str = "You have to teach these guys a lesson."
						+ "	You leap from your hiding spot and charge "
						+ "at them. You pull out your weapon and within moments the two Crips are on the ground. You turn your attention "
						+ "to the figure lying on the ground. To your surprise, he was one of your own. "
						+ "A fellow Blood. You go over and help him off the floor. "
						+ "	\"What was going on here?\" you question. The other "
						+ "Blood looks at the two guys on the ground, his body was all bruised up. "
						+ "	\"I-I was chased all the way up here "
						+ "by the Crips. I was trying to find out where their leader was hiding, but they caught me,\" he began. \"Did you "
						+ "find him?\" you asked. The guy nodded and pulled out a crumpled map. \"He hangs out near this small building "
						+ "called 'Jack's Coffee Shop'. It used to be a coffee shop in the south side, but now it's like a storage place "
						+ "where they keep their guns.\" Suddenly, you hear the sound of sirens in the distance. Crap! Someone must have "
						+ "called the police during the fight. "
						+ "	You feel a tug on your sleeve and you turn to see the other Blood pulling "
						+ "you towards the back of the alley. \"There's a manhole we can escape through. Let's get outta here.\" Within a "
						+ "few minutes, the two of your reemerged in a different area of the city. The other Bloods member left the scene "
						+ "almost instantly. It didn't matter though, you knew where you needed to go. Using the map, you headed towards "
						+ "the south side. "
						+ "	Eventually you found yourself outside of Jack's Coffee Shop. You found an air vent on the side "
						+ "of the building, and with surprisingly little effort, you were able to remove the rusty screws and crawl "
						+ "through. Before you knew it, you were inside the building. You were in some back office area. Before you could "
						+ "do anything else, you heard the sound of footsteps approaching. Hide! You ducked under the desk and watched as "
						+ "three men entered the room. You tried to hold your breath as you saw their faces. Two of the faces were new and "
						+ "unfamiliar, but the third one -- You'd recognize the Crips' leader anywhere. What should you do now?";
					} 
			}
			else if(previousChoices.get(3) == 2) {
				str = "You stay where you are, trying your best to listen in on their conversation."
						+ "	\"I thought you said you knew where "
						+ "you lived,\" one of the Crips said."
						+ "	\"I d-do. He lives near here,\" a man on the ground said. \"Where is 'near "
						+ "here'? Where is your leader?\""
						+ "	Suddenly, you knew what was going on. One of your own guys was going to rat you "
						+ "out and tell the Crips your home address! You had to protect your family! You leap out and within moments and "
						+ "attack, and within moments both Crips members are on the ground. You turn your attention to the third guy. A "
						+ "Bloods member."
						+ "	\"You were trying to rat me out, huh?\" you asked angrily. He flinches and begins to apologize "
						+ "profusely."
						+ "	\"I'm sorry, I'm sorry!\" he says. \"I was trying to find out where the Crips leader was hiding, but "
						+ "I got caught by those guys. They said they'd kill me unless I spoke!\" You were tempted to knock him out right "
						+ "then and there, but you controlled yourself. \"Did you find out where their leader lives?\" You had to keep "
						+ "your mind on the big prize. If you could take out their leader, then this little slip-up wouldn't even "
						+ "matter. The guy nods and pushes himself off the ground. He pulls out a crumpled map and hands it to you. "
						+ "\"He hangs out near this small building called 'Jack's Coffee Shop'. It used to be a coffee shop in the "
						+ "south side, but now it's like a storage place where they keep their guns.\" You nod."
						+ "	Suddenly, the sound of "
						+ "sirens arises from the distance. Crap! Someone must have called the police during the fight. With expert "
						+ "speed, you move to the back of the alley and disappear down a manhole, leaving the traitor behind. You "
						+ "reemerge in a different part of the city and begin heading south. Eventually you found yourself outside "
						+ "of Jack's Coffee Shop. You found an air vent on the side of the building, and with surprisingly little "
						+ "effort, you were able to remove the rusty screws and crawl through. Before you knew it, you were inside "
						+ "the building. You were in some back office area. Before you could do anything else, you heard the sound "
						+ "of footsteps approaching. Hide! You ducked under the desk and watched as three men entered the room. You "
						+ "tried to hold your breath as you saw their faces. Two of the faces were new and unfamiliar, but the third "
						+ "one -- You'd recognize the Crips' leader anywhere. What should you do now?";
			}
		}
		return str;
	}
	
	
	/**
	 * holds the string for the 5th choice A in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 5th choice A of the game based on previousChoices 
	 */
	public static String choiceA(ArrayList<Integer> previousChoices, MainCharacter character) {
			if((previousChoices.get(previousChoices.size() - 2) == 1) && (previousChoices.get(previousChoices.size() -1) == 1 || previousChoices.get(previousChoices.size() -1) == 2)){
				return null;
			}else{
					String a = "Escape through the vents!";
					return a;
				}
	}
	
	/**
	 * holds the string for the 5th choice B in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 5th choice B of the game based on previousChoices 
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		if((previousChoices.get(previousChoices.size() - 2) == 1) && (previousChoices.get(previousChoices.size() -1) == 1 || previousChoices.get(previousChoices.size() -1) == 2)){
			return null;
		}
		return "Attack!";
}
		
	/**
	 * holds the string for the 5th choice C in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 5th choice C of the game based on previousChoices 
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		return null;
}
		
	/**
	 * holds the string for the 5th choice D in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 5th choice D of the game based on previousChoices 
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		return null;
	}
}
