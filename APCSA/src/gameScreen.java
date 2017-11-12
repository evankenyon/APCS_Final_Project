import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class gameScreen {

	public static void main(String[] args){
	
		
	/**
	 * This is your character
	 */
	MainCharacter character = new MainCharacter();
	
	/**
	 * An array list of your previous choices 
	 */
	ArrayList<Integer> pastChoices = new ArrayList<Integer>();
	
	/**
	 * an array containing the first choices available to you 
	 */
	String[] firstChoices = moveOn.choiceList(pastChoices, character);
	
	/**
	 * The frame which contains the text for the story, choices and character stats
	 */
	JFrame frame = new JFrame("Double Life");
	
	/**
	 * the textbox which contains the text for the story
	 */
	JTextArea textbox = new JTextArea();
	
	/**
	 * the following code sets the original text for the textbox, sets its margins, sets it to wrap text in a visually pleasing 
	 * format, sets the textbox to not changeable by the user, sets the tab size, sets the bounds, sets the font and adds it to the 
	 * frame in that order
	 */
	textbox.setText(moveOn.continueOn(pastChoices, character));
	textbox.setMargin(new Insets(10, 10, 10, 10));
	textbox.setLineWrap(true);
	textbox.setWrapStyleWord(true);
	textbox.setEditable(false);
	textbox.setTabSize(100);
	textbox.setBounds(300,100,700,400);
	textbox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	frame.add(textbox);
	

	/**
	 * scroll allows for the user to scroll through the story if applicable, the following code adds in a scroll bar to the textbox
	 * with the story
	 */
	JScrollPane scroll = new JScrollPane(textbox);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    frame.add(scroll);
    scroll.setBounds(300,100,700,400);
    scroll.setSize(700, 400);
    scroll.setVisible(true);
	
	/**
	 * creation of the exit button:
	 * sets the bounds of the exit button, adds the exit button to the frame
	 */
	JButton exit = new JButton("X"); //text in close button
	exit.setBounds(20, 20, 45, 45); //location and size of exit button
	frame.add(exit);
	
	/**
	 * sets the size of the frame, sets the frame to visible
	 */
	frame.setSize(1280,985); //size of entire frame
	frame.setLayout(null);
	frame.setVisible(true);
	
	/**
	 * the following code sets up the functionality of the exit button by making sure the frame disappears once it is clicked
	 */
	exit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			frame.dispose();
		}
	});
	
	/**
	 * creation of the stats textbox that keeps track of all the character's conditions:
	 * intializes the "stats variable", sets the text in the stats textbox, makes the text visually pleasing and uneditable, sets
	 * the bounds, adds it to the frame 
	 */
	JTextArea stats = new JTextArea();
	stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
				"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
				+ "\nMoney:" + " " + character.getMoney());
	stats.setMargin(new Insets(10,10,10,10));
	stats.setLineWrap(true);
	stats.setWrapStyleWord(true);
	stats.setEditable(false);
	stats.setBounds(1025,100,200,200);
	stats.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	frame.add(stats);
	
	/**
	 * creation of restart button:
	 * sets the bounds, initializes the variable and adds it to the frame
	 */
	JButton restart = new JButton("Restart");
	restart.setBounds(1025, 300, 200, 200);
	frame.add(restart);
	
	 
	/**
	 * creation of the choice A button:
	 * initializes the variable, sets the bounds and adds it to the frame
	 */
	JButton choiceA = new JButton(firstChoices[0]);
	choiceA.setBounds(300, 500, 700, 50); //location and size of choice A
	frame.add(choiceA);
	
	/**
	 * creation of the choice B button
	 * initializes the variable, sets the bounds and adds it to the frame
	 */
	JButton choiceB = new JButton(firstChoices[1]);
	choiceB.setBounds(300, 550, 700, 50); //location and size of choice B
	frame.add(choiceB);
	
	/**
	 * creation of the choice C button
	 * initializes the variable, sets the bounds and adds it to the frame
	 */
	JButton choiceC = new JButton(firstChoices[2]);
	choiceC.setBounds(300, 600, 700, 50); //location and size of choice C
	frame.add(choiceC);
	
	/**
	 * creation of the choice D button
	 * initializes the variable, sets the bounds and adds it to the frame
	 */
	JButton choiceD = new JButton(firstChoices[3]);
	choiceD.setBounds(300, 650, 700, 50); //location and size of choice D
	frame.add(choiceD);
	
	
	/**
	 * tells the program what to do when the mouse interacts with the "choiceA" button
	 */
	choiceA.addMouseListener(new MouseListener() {

		@Override
		/**
		 * Code that runs when choice A is clicked on, changes the text of the story text and of all of the text 
		 * of the choice buttons and stats if applicable based on what the user just chose to do 
		 */
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			pastChoices.add(1);
			String[] secondChoices = moveOn.choiceList(pastChoices, character);
			moveOn.countChoices++;
			moveOn.countContinueOn++;
			textbox.setText(moveOn.continueOn(pastChoices, character));
			choiceA.setText(secondChoices[0]);
			choiceB.setText(secondChoices[1]);
			choiceC.setText(secondChoices[2]);
			choiceD.setText(secondChoices[3]);
			stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
					"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
					+ "\nMoney:" + " " + character.getMoney());
			if(choiceA.getText() == null) choiceA.setVisible(false);
			if(choiceB.getText() == null) choiceB.setVisible(false);
			if(choiceC.getText() == null) choiceC.setVisible(false);
			if(choiceD.getText() == null) choiceD.setVisible(false);
			if(choiceA.getText() != null) choiceA.setVisible(true);
			if(choiceB.getText() != null) choiceB.setVisible(true);
			if(choiceC.getText() != null) choiceC.setVisible(true);
			if(choiceD.getText() != null) choiceD.setVisible(true);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	/**
	 * tells the program what to do when the mouse interacts with the "choiceB" button
	 */
	choiceB.addMouseListener(new MouseListener() {

		@Override
		/**
		 * Code that runs when choice B is clicked on, changes the text of the story text and of all of the text 
		 * of the choice buttons and stats if applicable based on what the user just chose to do 
		 */
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			pastChoices.add(2);
			String[] secondChoices = moveOn.choiceList(pastChoices, character);
			moveOn.countChoices++;
			moveOn.countContinueOn++;
			textbox.setText(moveOn.continueOn(pastChoices, character));
			choiceA.setText(secondChoices[0]);
			choiceB.setText(secondChoices[1]);
			choiceC.setText(secondChoices[2]);
			choiceD.setText(secondChoices[3]);
			stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
					"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
					+ "\nMoney:" + " " + character.getMoney());
			if(choiceA.getText() == null) choiceA.setVisible(false);
			if(choiceB.getText() == null) choiceB.setVisible(false);
			if(choiceC.getText() == null) choiceC.setVisible(false);
			if(choiceD.getText() == null) choiceD.setVisible(false);
			if(choiceA.getText() != null) choiceA.setVisible(true);
			if(choiceB.getText() != null) choiceB.setVisible(true);
			if(choiceC.getText() != null) choiceC.setVisible(true);
			if(choiceD.getText() != null) choiceD.setVisible(true);
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	/**
	 * tells the program what to do when the mouse interacts with the "choiceC" button
	 */
	choiceC.addMouseListener(new MouseListener() {

		@Override
		/**
		 * Code that runs when choice C is clicked on, changes the text of the story text and of all of the text 
		 * of the choice buttons and stats if applicable based on what the user just chose to do 
		 */
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			pastChoices.add(3);
			String[] secondChoices = moveOn.choiceList(pastChoices, character);
			moveOn.countChoices++;
			moveOn.countContinueOn++;
			textbox.setText(moveOn.continueOn(pastChoices, character));
			choiceA.setText(secondChoices[0]);
			choiceB.setText(secondChoices[1]);
			choiceC.setText(secondChoices[2]);
			choiceD.setText(secondChoices[3]);
			stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
					"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
					+ "\nMoney:" + " " + character.getMoney());
			if(choiceA.getText() == null) choiceA.setVisible(false);
			if(choiceB.getText() == null) choiceB.setVisible(false);
			if(choiceC.getText() == null) choiceC.setVisible(false);
			if(choiceD.getText() == null) choiceD.setVisible(false);
			if(choiceA.getText() != null) choiceA.setVisible(true);
			if(choiceB.getText() != null) choiceB.setVisible(true);
			if(choiceC.getText() != null) choiceC.setVisible(true);
			if(choiceD.getText() != null) choiceD.setVisible(true);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	/**
	 * tells the program what to do when the mouse interacts with the "choiceD" button
	 */
	choiceD.addMouseListener(new MouseListener() {

		@Override
		/**
		 * Code that runs when choice D is clicked on, changes the text of the story text and of all of the text 
		 * of the choice buttons and stats if applicable based on what the user just chose to do 
		 */
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub))
			pastChoices.add(4);
			String[] secondChoices = moveOn.choiceList(pastChoices, character);
			moveOn.countChoices++;
			moveOn.countContinueOn++;
			textbox.setText(moveOn.continueOn(pastChoices, character));
			choiceA.setText(secondChoices[0]);
			choiceB.setText(secondChoices[1]);
			choiceC.setText(secondChoices[2]);
			choiceD.setText(secondChoices[3]);
			stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
					"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
					+ "\nMoney:" + " " + character.getMoney());
			if(choiceA.getText() == null) choiceA.setVisible(false);
			if(choiceB.getText() == null) choiceB.setVisible(false);
			if(choiceC.getText() == null) choiceC.setVisible(false);
			if(choiceD.getText() == null) choiceD.setVisible(false);
			if(choiceA.getText() != null) choiceA.setVisible(true);
			if(choiceB.getText() != null) choiceB.setVisible(true);
			if(choiceC.getText() != null) choiceC.setVisible(true);
			if(choiceD.getText() != null) choiceD.setVisible(true);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	/**
	 * tells the program what to do when the mouse interacts with the "restart" button
	 */
	restart.addMouseListener(new MouseListener() {

		@Override
		/**
		 * Code that runs when the restart button is clicked on, changes the text of the story text and of all of the text 
		 * of the choice buttons to the beginning text and resets the character stats
		 */
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			pastChoices.clear();
			character.setAmmo(0);
			character.setDrugs(0);
			character.setHealth(100);
			character.setMoney(0);
			character.setWeapon("None");
			moveOn.countContinueOn = -1;
			moveOn.countChoices = 0;
			String[] secondChoices = moveOn.choiceList(pastChoices, character);
			moveOn.countChoices++;
			moveOn.countContinueOn++;
			textbox.setText(moveOn.continueOn(pastChoices, character));
			choiceA.setText(secondChoices[0]);
			choiceB.setText(secondChoices[1]);
			choiceC.setText(secondChoices[2]);
			choiceD.setText(secondChoices[3]);
			stats.setText("Health:" + " " + character.getHealth() + "\nWeapon:" + " " + character.getWeapon() +
					"\nAmmo Amount:" + " " + character.getAmmo() + "\nDrugs Amount:" + " " + character.getDrugs()
					+ "\nMoney:" + " " + character.getMoney());
			if(choiceA.getText() == null) choiceA.setVisible(false);
			if(choiceB.getText() == null) choiceB.setVisible(false);
			if(choiceC.getText() == null) choiceC.setVisible(false);
			if(choiceD.getText() == null) choiceD.setVisible(false);
			if(choiceA.getText() != null) choiceA.setVisible(true);
			if(choiceB.getText() != null) choiceB.setVisible(true);
			if(choiceC.getText() != null) choiceC.setVisible(true);
			if(choiceD.getText() != null) choiceD.setVisible(true);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
		}
	

	}

	
