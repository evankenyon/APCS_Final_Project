import java.util.ArrayList;

public class textChoiceThree extends textChoice{

	/**
	 * it holds the text for the continuation of the game after you pick your third choice
	 * and updates your characters stats and bases some of the text off of your character stats
	 * @param previousChoices the choice you picked
	 * @param character your character
	 * @return the text for the next part of the game based on the the choice you picked
	 */
	public static String text(ArrayList<Integer> previousChoices, MainCharacter character) {
		String str = null;
		if(previousChoices.get(2) == 1){
			character.setMoney(character.getMoney() + 10000);
			character.setHealth(character.getHealth() - 25);
			str = "You go inside before leaving for the day. It's already 7 in the morning, time sure flies. You take a shower,"
					+ " get dressed and freshen up. You say goodbye to your wife and kids. Your wife wishes you a good day at "
					+ "the office -- if only she knew. You get into your car and drive downtown. It's the middle of the day, "
					+ "this kind of business is risky. On the way downtown you call your supplier and ask to meet up in the "
					+ "usual spot, the one known by all the good suppliers. The cops won't find you there. You make it to the "
					+ "alley, and you see that your supplier got there a few minutes before you. He did a sloppy job of "
					+ "putting the manhole cover back on. You slide it off and go down into the sewers. Your work starts now. "
					+ "		You know that today makes or breaks it all. You need this money for the gang. The Crips might not know "
					+ "it yet, but your gang is broke. As soon as they find out, they will attack your gang and your death "
					+ "will be inevitable.  This is your day. You can do this. You get the drugs from your supplier, he lets "
					+ "you have them for a lower price than he charges his other customers because of your relationship. "
					+ "You've known him for a long time. You decide to sell the drugs to the rival gang while disguised as "
					+ "a spy. It's your way in, you can get some intel on them. You know that they have an entrance to their "
					+ "headquarters in the sewers, so you start walking."
					+ "		It's almost pitch black. The way in front of you is "
					+ "lit up  only by your phone flashlight. You are scared. There's a noise coming from the left. It's "
					+ "getting louder. And louder. And louder! BAM! A squirrel runs by. Come on, don't lose your cool."
					+ "		You "
					+ "get closer and see that there are no guards. This is pathetic. And you thought you had no money. You "
					+ "enter the headquarters and ask for the drop off room for the drugs. You are directed towards the room "
					+ "and see the head of the drug operation."
					+ "		''There weren't any orders today that I knew of''"
					+"		''The boss ordered me to do an undercover order''"
					+"		''Why''"
					+"		''You know as well as I do that it's embarrassing how little money we have. We can't let the rest of the gang know about our financial problems''"
					+ "		''I see, I'll go get the money''"
					+ "		He leaves and is gone for quite a while. Crap. He probably told the boss that something fishy was going on. "
					+ "I'll definitely be in trouble now. The guy comes back and gives you the money, You attempt to leave, but the next "
					+ "thing you know you are on the ground and everything goes black. You wake up in a room, tied to a chair. The enemy "
					+ "boss is right next to you. What do you do?";
					
		}else if(previousChoices.get(2) == 2){
			str = "You go inside before leaving for the day. It's already 7 in the morning, time sure flies. You take"
					+ " a shower, get dressed and freshen up. You say goodbye to your wife and kids. Your wife wishes"
					+ " you a good day at the office -- if only she knew. You get into your car and drive. Slowly, the"
					+ " suburban houses that line the road morph into taller and taller buildings until you hit the"
					+ " downtown area. You try your best to take the side roads to avoid the heavy traffic, though"
					+ " eventually you pull up to your location. The SkySide Hotel."
					+ "		The valet runs over to your car,"
					+ " though before you even exit the vehicle, he knows who you are. He's one of your own. A Bloods"
					+ " brother. "
					+ "		''I'd like to park overnight,'' you say, tossing the keys over to him. You've done this"
					+" countless times before, the valet knows what to do. He'll take your car to a safe spot for the"
					+ " night while you lurk down into enemy territory. It would draw too much attention for you to"
					+ " drive such a fancy car around town, and it was important to keep your head low during this"
					+ " mission -- one wrong encounter and you're dead."
					+ "		\"I plan on spending the afternoon near the"
					+ " south side, do you know of any good spots to pick up lunch?\" you continue. This is code speak"
					+ "-- you're asking him if he's heard about the whereabouts of the Crips. He nods and runs back"
					+ " to a podium placed outside the hotel. Once he returns he hands you a map of the south side"
					+ " with some places marked. \"I've heard these spots are good,\" he answers."
					+ "		\"Thanks,\" you say before you begin to make your way down south. This is a day where you can't"
					+ " afford to mess up. The Crips didn't know it yet, but your gang is broke. And once they found"
					+ " out, there was no doubt they would attack your side of town and your death would be inevitable."
					+ " You had to strike them first. You had to find a way to weaken them from the inside before they"
					+ " have a chance to undercut you."
					+ "		You wait until you're a few paces away before glancing down at"
					+ " the map the valet gave you. There are three different locations marked. Circled locations mean"
					+ " that's where a lot of the Crip rookies have been spotted. They're probably guarding something"
					+ " -- like a drug or weapons storage. Good place to visit if you are looking to steal some of "
					+ "their resources. Places with a \"X\" through them are where the most violence has been occurring"
					+ " recently. Best to avoid those places, unless you are truly looking for some blood. Places "
					+ "with an arrow pointing towards them are where he's been spotted -- the leader of the Crips. "
					+ "Dangerous business, though potentially big rewards if you manage to do him in.";
			
		}else if(previousChoices.get(2) == 3){
			str = "As you make your way towards the car, you pause. You do this everyday it feels like, and every"
					+ " time it feels like your doubt becomes stronger and stronger. Do you really want to live this"
					+ " way? The moment you enter this vehicle, you know you are risking your life. Every day is "
					+ "another chance to wind up dead somewhere in a ditch. You turn back to face the garage door. "
					+ "What about your wife and kids? What would they do if you died? What would they think if they "
					+ "found out everything? Your wife and kids -- You hardly spend time with them anymore. You're "
					+ "always busy with your \"job\". Wasn't the whole reason of joining this gang to save your family "
					+ "from poverty? You sigh. You do this every day. Why don't you ever take a day off? Just to be "
					+ "with your family."
					+ "After a moment's pause, you feel yourself turn around and head back towards the door."
					+ " \"Honey!\" you call out. You open the garage door to find your wife standing in the kitchen "
					+ "with your three children sitting around the table.\"Yes?\" She asks. Your children look up at "
					+ "you. \"How long has it been since we've gone on a date together?\" Your wife gives you a "
					+ "confused look. \"Oh, I don't know -- It's been a while--\" \"We should go out today. A lunch date."
					+ " I can afford to miss a day of work, it doesn't matter. I still have a few 'sick days' saved "
					+ "up. And maybe once the kids get home for school, we can do something together as a family. "
					+ "Didn't you kids say you wanted to see that new movie that came out? We can do that tonight, "
					+ "don't you think?\" By this point, your whole family is staring at you in surprise. After a "
					+ "moment, your wife nods. She smiles at you. \"A-Are you sure? I mean, it sounds lovely, but--\" "
					+ "\"I'm sure.\" You smile at her. All the kids are laughing as you put your arm around your wife "
					+ "and you look into each other's eyes. At that moment you can't help but think, \"It's about "
					+ "time"
					+ " I start putting my family first\"."
					+ "				"
					+ "		Game Over.";	
			
		}else if(previousChoices.get(2) == 4){
			if(!(character.getWeapon().toLowerCase().equals("none"))){
			str = "You go inside before leaving for the day. It's already 7 in the morning, time sure flies. You take "
					+ "a shower, get dressed and freshen up. You say goodbye to your wife and kids. Your wife wishes you a good "
					+ "day at the office, if only she knew. You get into your car and drive. Honestly, it hardly mattered where "
					+ "you went today anyways. Your gang was broke. The Crips didn't know it yet, thankfully, but as soon as they "
					+ "found out, there was no doubt they would attack your side of town. Your death would be inevitable. Today "
					+ "seemed rather pointless in light of it all. Unless you can find a way to raise money for your gang fast, "
					+ "you were out of hope."
					+ "		Before you realized it, you were already driving through downtown Chicago. You came "
					+ "to a stop behind some traffic and glanced out your window in a daze. What should you do today? Were you "
					+ "honestly planning on just wandering around the town? Just in that moment, you caught something out of the "
					+ "corner of your eye. Being in a gang sharpens your senses, if nothing else. You twist your head towards a "
					+ "dark alleyway crammed between two of the city buildings where a few shadows seemed to be shifting. Most "
					+ "people who grew up in the city would ignore something so small. But you knew better. This was the Bloods "
					+ "side of town, your side of town, and you knew when something was up."
					+ "		Swiftly, you pulled over to the side "
					+ "of the road in an open parking spot and left your car. You tried your best to blend into the crowd as you "
					+ "shuffled past the alleyway, though you made sure to take a glance in as you walked by. Two figures were "
					+ "standing and there seemed to be another figure laying on the ground. You heard mumbled voices coming from "
					+ "the standing figures, though it was impossible to make out what they were saying completely."
					+ "		''I thought"
					+ "you said --.''"
					+ "		''You little --.''"
					+ "		''... lie to us?''"
					+ "		Then you saw it. The standing figures had blue bandanas hanging"
					+ " out of their back pockets. Crips.'' You try to keep your cool as you keep moving forward. You press yourself "
					+ "against the front of the building next to the alleyway. You reach inside of your coat and feel the weapon you "
					+ "placed there earlier. You didn't think you'd have to use this today, but it seems like you have no choice. Whatever "
					+ "the Crips were doing up here, it wasn't good. You had to stop them before they had a chance to finish whatever "
					+ "they're trying to start. You take a deep breath.";
			}
					
			if(character.getWeapon().toLowerCase().equals("none")){
					str = "You go inside before leaving for the day. It's already 7 in the morning, time sure flies. You take "
					+ "a shower, get dressed and freshen up. You say goodbye to your wife and kids. Your wife wishes you a good "
					+ "day at the office, if only she knew. You get into your car and drive. Honestly, it hardly mattered where "
					+ "you went today anyways. Your gang was broke. The Crips didn't know it yet, thankfully, but as soon as they "
					+ "found out, there was no doubt they would attack your side of town. Your death would be inevitable. Today "
					+ "seemed rather pointless in light of it all. Unless you can find a way to raise money for your gang fast, "
					+ "you were out of hope."
					+ "		Before you realized it, you were already driving through downtown Chicago. You came "
					+ "to a stop behind some traffic and glanced out your window in a daze. What should you do today? Were you "
					+ "honestly planning on just wandering around the town? Just in that moment, you caught something out of the "
					+ "corner of your eye. Being in a gang sharpens your senses, if nothing else. You twist your head towards a "
					+ "dark alleyway crammed between two of the city buildings where a few shadows seemed to be shifting. Most "
					+ "people who grew up in the city would ignore something so small. But you knew better. This was the Bloods "
					+ "side of town, your side of town, and you knew when something was up."
					+ "		Swiftly, you pulled over to the side "
					+ "of the road in an open parking spot and left your car. You tried your best to blend into the crowd as you "
					+ "shuffled past the alleyway, though you made sure to take a glance in as you walked by. Two figures were "
					+ "standing and there seemed to be another figure laying on the ground. You heard mumbled voices coming from "
					+ "the standing figures, though it was impossible to make out what they were saying completely."
					+ "		''I thought"
					+ "you said --.''"
					+ "		''You little --.''"
					+ "		''... lie to us?''"
					+ "		Then you saw it. The standing figures had blue bandanas hanging"
					+ "out of their back pockets. Crips.'' You try to keep your cool as you keep moving forward. You press yourself "
					+ "against the front of the building next to the alleyway. Dammit, you should have grabbed a weapon this morning. "
					+ "What were you thinking? You didn't think you'd have to use one today, but it's too late now. Whatever the "
					+ "Crips were doing up here, it wasn't good. You had to stop them before they had a chance to finish whatever "
					+ "they're trying to start. You take a deep breath.";	
			}
			
		}
		return str;
	}
	
	
	/**
	 * holds the string for the 4th choice A in the game (based upon previous choices made and character stats)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 4th choice A of the game based on previousChoices 
	 */
	public static String choiceA(ArrayList<Integer> previousChoices, MainCharacter character) {
			if(previousChoices.get(previousChoices.size() -1) == 1){
				if(!(character.getWeapon().equals("None"))) {
					String a = "Use weapon";
					return a;
				}
				String a = "Attack";
				return a;
			}else if(previousChoices.get(previousChoices.size() -1) == 2) {
				String a = "Go to the location that's circled";
				return a;
			}else if(previousChoices.get(previousChoices.size() -1) == 3) {
				return null;
			} else if(previousChoices.get(previousChoices.size() -1) == 4) {
				String a = "Attack them";
				return a;
			}
		return null;
	}
	
	/**
	 * holds the string for the 4th choice B in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 4th choice B of the game based on previousChoices 
	 */
	public static String choiceB(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) == 1){
			String b = "Escape";
			return b;
		}else if(previousChoices.get(previousChoices.size() -1) == 2) {
			String b = "Go to the location with an 'X'";
			return b;
		}else if(previousChoices.get(previousChoices.size() -1) == 3) {
			return null;
		} else if(previousChoices.get(previousChoices.size() -1) == 4) {
			String b = "Keep eavesdropping";
			return b;
		}
	return null;
}
		
	/**
	 * holds the string for the 4th choice C in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 4th choice C of the game based on previousChoices 
	 */
	public static String choiceC(ArrayList<Integer> previousChoices) {
		if(previousChoices.get(previousChoices.size() -1) == 1){
			return null;
		}else if(previousChoices.get(previousChoices.size() -1) == 2) {
			String c = "Go to the location with an arrow";
			return c;
		}else if(previousChoices.get(previousChoices.size() -1) == 3) {
			return null;
		} else if(previousChoices.get(previousChoices.size() -1) == 4) {
			String c = null;
			return c;
		}
	return null;
}
		
	/**
	 * holds the string for the 4th choice D in the game (based upon previous choices made)
	 * @param previousChoices an array list of previous choices 
	 * @return	the 4th choice D of the game based on previousChoices 
	 */
	public static String choiceD(ArrayList<Integer> previousChoices) {
		return null;
	}
}