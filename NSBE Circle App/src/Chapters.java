import java.util.ArrayList;

public class Chapters {

	String university;
	String city;
	String state;
	ArrayList<Object> members = new ArrayList<Object>();
	
	public void addMember(Member name){
		members.add(name);
	}
}
