package com.example.chels.nsbe_network.DB;
import java.util.ArrayList;

public class State{

    public String sName;
    public ArrayList<Chapter> chapter;
    public ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    
    public State(String stateName){
        sName = stateName;
    }

    public void addChapter(Chapter name){
		chapters.add(name);
	}
    
}
