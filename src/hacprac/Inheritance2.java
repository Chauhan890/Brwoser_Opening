package hacprac;

class Animal{
	void walk() {
		System.out.println("I can walk");
	}
}
class Bird extends Animal{
	void fly() {
		System.out.println("I can fly");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}

}
