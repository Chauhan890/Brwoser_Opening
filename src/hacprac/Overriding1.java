package hacprac;
class Sports{
    String getName(){
        return "genric Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sp = new Sports();
		System.out.println(sp.getName());
		sp.getNumberOfTeamMembers();
		Soccer soc = new Soccer();
		System.out.println(soc.getName());
		soc.getNumberOfTeamMembers();
	}
}
