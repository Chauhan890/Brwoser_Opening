package hacprac;
class Motor{
    void display(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine");
    }
}
class vehicle extends Motor{
    @Override
    void display(){
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
    void msg() {
    	display();
    	super.display();
    }
    
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle vh = new vehicle();
		vh.msg();
		
	}

}
