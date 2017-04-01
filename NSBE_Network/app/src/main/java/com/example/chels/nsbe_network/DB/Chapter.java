package com.example.chels.nsbe_network.DB;
import java.util.ArrayList;

public class Chapter {

	public String university;
	public String city;
	public String state;
	public ArrayList<Member> members = new ArrayList<Member>();
	
	public Chapter(String university, String city, String state) {
		this.university = university;
		this.city = city;
		this.state = state;
}
	  
	public void addMember(Member name){
		members.add(name);
	}
}
