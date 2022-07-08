package hacprac;
abstract class Book{
    String title;
    abstract void setTitle(String t);
    String getTitle() {
    	return title;
	}   
}
class Title extends Book{
	void display(){
        System.out.println("The title is: ");										// PENDING
    }
	@Override
	void setTitle(String t) {
		// TODO Auto-generated method stub
		System.out.println("A tale of two cities");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Title title = new Title();
		title.display();
	}

}
