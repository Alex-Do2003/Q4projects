package pacman;

import javax.swing.JFrame;

public class runner extends JFrame{

	public runner() {
		add(new pacman());
	}
	
	
	public static void main(String[] args) {
		runner pac = new runner();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}