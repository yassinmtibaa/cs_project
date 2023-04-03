import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner;

public class Achievement {

	// ATTRIBUTES 
	private String title ; 
	private Date start_date ; 
	private Date end_date; 
	private String comments ; 
	private List<String> skills ; 
	
	// CONSTRUCTOR 
	public Achievement (String title, String comments, int s_day, int s_month, int s_year, int e_day, int e_month, int e_year) {
		setTitle(title);
		setComments(comments);
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
	public boolean  verTitle(String title) {
		System.out.println("what is the title of your acadamic achivement");
		title=TextIO.getlnString();
		  if (title == null || title.isEmpty()) {
		        return false;
		    }

		    // Check if the title starts with "Academics"
	
		    
		    // Check if the title contains only alphanumeric characters and spaces
		    if (!title.matches("[A-Za-z0-9 ]+")) {
		        return false;
		    }
		    

		    
		    // If all checks pass, the title is valid
		    return true;
	}

	// COMMENTS 
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	

	
	   public void val_Comment() {
		   Scanner input = new Scanner(System.in);


	      System.out.print("Do you want to add a paragraph? (yes/no): ");
	      String answer = input.nextLine().toLowerCase();

	      while (!isValidInput(answer)) {
	         System.out.print("Invalid input. Please enter 'yes' or 'no': ");
	         answer = input.nextLine().toLowerCase();
	      }

	      if (answer.equals("yes")) {
	         System.out.println("You have chosen to add a paragraph.");
	         // Code to add a paragraph goes here
	      } else {
	         System.out.println("You have chosen not to add a paragraph.");
	      }

	      input.close();
	   }

	   public static boolean isValidInput(String input) {
	      return input.equals("yes") || input.equals("no");
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
		        return new ArrayList<>(skills);
		    }

		    public void addSkill(String skill) {
		        if (skill == null || skill.isEmpty()) {
		            throw new IllegalArgumentException("Skill cannot be null or empty.");
		        }
		        skills.add(skill);
		    }

		    public void removeSkill(String skill) {
		        if (skill == null || skill.isEmpty()) {
		            throw new IllegalArgumentException("Skill cannot be null or empty.");
		        }
		        if (!skills.contains(skill)) {
		            throw new IllegalArgumentException("Skill not found.");
		        }
		        skills.remove(skill);
		    }
		}

