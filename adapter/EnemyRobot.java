package adapter;

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();
	
	public void smashWithHand() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes " + attackDamage + " With Its Hands");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps On " + driverName);
	}
}
