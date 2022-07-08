package hacprac;
 
class Arithmetic{
	int sum = 0;
	int sum (int a, int b) 
	{
	    sum = a+b ;
		return sum;
	}
}
class Adder extends Arithmetic{
	void display() {
		System.out.println("My superclass is : Arithmetic");
		}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder add = new Adder();
		add.display();
		System.out.println(add.sum(10,10));
	}

}
