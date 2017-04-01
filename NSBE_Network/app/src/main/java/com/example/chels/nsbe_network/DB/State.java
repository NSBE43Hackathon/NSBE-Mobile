import java.util.ArrayList;

public class State{

    public String sName;
    public ArrayList<Chapter> chapters;
    public ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    
    public State(String stateName){
        sName = stateName;
    }
    
    public void addChapter(Chapter name){
		members.add(name);
	}
    
}