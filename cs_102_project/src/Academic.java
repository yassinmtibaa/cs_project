public class Academic {
	
	// ATTRIBUTES
	private String title ;
	private String field ; 
	private String establishment; 
	private Date start_date ; 
	private Date end_date; 
	private int status; 
	
	// CONSTRUCTOR 
	public Academic(String title, String field, String establishment, int status, int s_day, int s_month, int s_year, int e_day, int e_month, int e_year) {
		setTitle(title);
		setField(field);
		setEstablishment(establishment); 
		setStart_date(s_day, s_month, s_year); 
		setEnd_date(e_day, e_month, e_year);
	}
	
	// GETTERS AND SETTERS 
	
	//TITLE AND IT'S VERIFICAATION
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean  verTitle(String title) {
		System.out.println("what is the title of your  achivement");
		title=TextIO.getlnString();
		  if (title == null || title.isEmpty()) {
		        return false;
		    }

		    // Check if the title starts with "Academics"
		    if (!title.startsWith("Academics")) {
		        return false;
		    }
		    
		    // Check if the title contains only alphanumeric characters and spaces
		    if (!title.matches("[A-Za-z0-9 ]+")) {
		        return false;
		    }
		    

		    
		    // If all checks pass, the title is valid
		    return true;
	}
	
	// FIELD
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	public boolean verField() {
			    // Check if the title is null or empty
			    if (field == null || field.isEmpty()) {
			        return false;
			    }



			    // Check if the title contains only alphabetical characters and spaces
			    if (!field.matches("[A-Za-z ]+")) {
			        return false;
			    }
			    return true;

	}
	
	
	// ESTABLISHMENT 
	public String getEstablishment () {
		return (establishment ); 
	}
	
	
	public void setEstablishment(String establishment) {
		this.establishment = establishment ; 
	}
	public boolean  verestablishment(String title) {
		
		  if (establishment == null || establishment.isEmpty()) {
		        return false;
		    }



		    
		    // Check if the title contains only alphanumeric characters and spaces
		    if (!title.matches("[A-Za-z0-9 ]+")) {
		        return false;
		    }
		    

		    
		    // If all checks pass, the title is valid
		    return true;
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
	//STATUS
		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}	
		
		public boolean verStatus(int status) {
			switch (status) {
			case 1:
				System .out.println("you ended the academic course");	
			case 0:
				
					System .out.println("you are still in the academic course");
				
					
				
			default :
				return false;
			}
		}
	
	
}
