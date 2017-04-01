import java.util.ArrayList;

public class Region {

    public String rName;
    public ArrayList<State> states = new ArrayList<State>(); 
    
    public Region(String regionName)
    {
        rName = regionName;
    }
    
}
