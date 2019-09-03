package adapter;

// this is what the client expects to be working with
public interface EnemyAttacker {
	public void fireWeapon();
	public void driveForward();
	public void assignDriver(String driverName);
}
