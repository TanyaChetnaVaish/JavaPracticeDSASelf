package Practice;

public class Car implements Comparable<Car> {
	// implements Comparable<Car> {
	int speed;
	int price;
	String color;
	public Car(int speed,int price,String color) {
		this.speed=speed;
		this.price=price;
		this.color=color;
	}

	public String toString() {
		return "S:"+this.speed+"P:"+this.price+"C:"+this.color;
	}
	public int compareTo(Car other) {
		return this.speed-other.speed;
	}




}
