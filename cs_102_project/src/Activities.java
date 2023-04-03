// Importing necessary libs 

import java.util.ArrayList; 
import java.util.List; 

public class Activities {
	
	// ATTRIBUTES 
	
	private String title; 
	private String field; 
	private Date start_date; 
	private Date end_date;
	private List<String> skills ; 
	
	
	// CONSTRUCTOR 
	
	public Activities(String title, String field, int s_day, int s_month, int s_year, int e_day, int e_month, int e_year) {
		setTitle(title);
		setField(field); 
		setStart_date(s_day, s_month, s_year); 
		setEnd_date(e_day, e_month, e_year);
		skills = new ArrayList<String>(); // create a new instance of the ArrayList class / skills is initialized as an empty ArrayList
	}
	
	// GETTERS AND SETTERS   
	
	//TITLE
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//FIELD
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	//START_DATE
	public Date getStart_date() {
		return start_date;
	}
	 public void setStart_date(int day, int month, int year) {
	        this.start_date = new Date(day, month, year);
	    }
	
	//END_DATE
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(int day, int month, int year) {
        this.end_date = new Date(day, month, year);
    }	
	
	// SKILLS 
	
	 public List<String> getSkills() {
	        return skills;
	    }

	 public void addSkill(String skill) {
	        skills.add(skill);
	    }

	 public void removeSkill(String skill) {
	        skills.remove(skill);
	    }
	

}
