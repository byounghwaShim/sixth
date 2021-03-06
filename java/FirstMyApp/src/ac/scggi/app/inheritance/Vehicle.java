package ac.scggi.app.inheritance;

public class Vehicle {
	public String whereUsing;
	public int speed;
	public final static int MAX_SPEED = 300;
	public Vehicle(String whereUsing, int speed) {
		this.whereUsing = whereUsing;
		this.speed = speed;
	}
	public void startEngine() {
		System.out.println("Vehicle's startEngine");
	}
	public boolean applyAcc(int amount) {
		if ( speed+amount > MAX_SPEED ) {
			return false;
		}
		speed += amount;
		return true;
	}
}
