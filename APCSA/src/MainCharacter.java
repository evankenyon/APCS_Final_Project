import java.util.ArrayList;

public class MainCharacter {
	
	/**
	 * health of the character
	 */
	private int health;
	
	/**
	 * the amount of ammo your character has
	 */
	private int ammo;
	
	/**
	 * the weapon your character has 
	 */
	private String weapon;
	
	/**
	 * the amount of drugs your character has 
	 */
	private int drugs;
	
	/**
	 * the amount of money your character has
	 */
	private double money;
	
	/**
	 * the default constructor for your character
	 */
	public MainCharacter() {
		health = 100;
		ammo = 0;
		weapon = "None";
		drugs = 0;
		money = 0;
	}
	
	
	/**
	 * gets the variable health which keeps track of the character's health
	 * @return int variable health that the character has 
	 */
	public int getHealth(){
		return health;
	}
	
	/**
	 * allows manipulation of the variable health that tracks the character's health
	 * @param health the amount of health you want your character to have
	 */
	public void setHealth(int health){
		this.health = health;
	}
	
	/**
	 * gets the variable ammo which tracks the amount of ammo in the character's weapon
	 * @return int variable ammo that the character has 
	 */
	public int getAmmo(){
		return ammo;
	}
	
	/**
	 * allows manipulation of the ammo variable which tracks the amount of ammo in the character's weapon
	 * @param ammo amoutn of ammo that you want the character to have 
	 */
	public void setAmmo(int ammo){
		if(getWeapon().equals("rifle") || getWeapon().equals("handgun")) this.ammo = ammo;
	}
	
	/**
	 * gets the variable drugs which keeps track of the amount of drugs your character owns
	 * @return int variable amount of drugs your character has 
	 */
	public int getDrugs(){
		return drugs;
	}
	
	/**
	 * allows manipulation of the variable drugs that keeps track of the amount of drugs your character owns
	 * @param drugs amount of drugs that you want your character to have 
	 */
	public void setDrugs(int drugs){
		this.drugs = drugs;
	}
	
	/**
	 * gets the variable weapon which tells you what weapon your character has
	 * @return string variable weapon that your character has 
	 */
	public String getWeapon(){
		return weapon;
	}
	
	/**
	 * allows manipulation of the variable weapon that tracks what weapon your character has
	 * @param weapon weapon that you want your character to have
	 */
	public void setWeapon(String weapon){
		this.weapon = weapon;
	}
	
	/**
	 * gets the variable money that tracks how much money your character has
	 * @return double variable money that your character has 
	 */
	public double getMoney(){
		return money;
	}
	
	/**
	 * allows manipulation of the variable money that tracks how much money your character has
	 * @param money amount of money that you want your character to have 
	 */
	public void setMoney(double money){
		this.money = money;
	}
	
	/**
	 * a method to determine whether or not your character will win based on past decisions and the weapon you possess
	 * @param pastChoices the past choices you have made in the game
	 * @return true or false if you will win or not
	 */
	public boolean willWin(ArrayList<Integer> pastChoices) {
		double r = Math.random();
		if(pastChoices.get(2) == 1) {
			if(getWeapon().toLowerCase().equals("rifle")) {
				if(r < .8) return true;
			}
			if(getWeapon().toLowerCase().equals("handgun")) {
				if(r < .65) return true;
			}
			if(getWeapon().toLowerCase().equals("knife")) {
				if(r < .3) return true;
			}
			if(getWeapon().toLowerCase().equals("none")) {
				if(r < .05) return true;
			}
		}
		if(pastChoices.get(2) == 2) {
			if(getWeapon().toLowerCase().equals("rifle")) {
				if(r < .9) return true;
			}
			if(getWeapon().toLowerCase().equals("handgun")) {
				if(r < .75) return true;
			}
			if(getWeapon().toLowerCase().equals("knife")) {
				if(r < .4) return true;
			}
			if(getWeapon().toLowerCase().equals("none")) {
				if(r < .15) return true;
			}
		}
		if(pastChoices.get(2) == 4) {
			if(getWeapon().toLowerCase().equals("rifle")) {
				if(r < .85) return true;
			}
			if(getWeapon().toLowerCase().equals("handgun")) {
				if(r < .65) return true;
			}
			if(getWeapon().toLowerCase().equals("knife")) {
				if(r < .35) return true;
			}
			if(getWeapon().toLowerCase().equals("none")) {
				if(r < .1) return true;
			}
		}
		return false;
	}
}
