public class Date {
	
	// Attributes 
	
	private int day;
	private int month; 
	private int year; 
	
	
	//CONSTRUCTOR 
	
		public Date(int day, int month, int year) {
		    setYear(year);
		    setMonth(month, day, year);
		    setDay(day);
		}
	
	// getters and setters 
	
	//DAY
	public int getDay() {
		return day; }
	public void setDay(int day) {
		do {
			if ( day < 1 || day > 31 ) {
				System.out.println(" Please enter a number between 1 and 31");
			} else {
				this.day = day ; 
			}
		} while ( day < 1 || day > 31 );
	}
	
	//MONTH
	public int getMonth() {
		return month;}
	public void setMonth(int month, int day, int year) {
		do {
			if ( month < 1 || day > 12 ) {
				System.out.println("Please enter a value between 1 and 12");
			} else if (month==2) {
				do {
	                System.out.println("Enter value between 1 and 29");
	                setDay(day);
	                if (this.day < 1 || this.day > 29) {
	                    System.out.println("Invalid input for February. Please enter a value between 1 and 29.");
	                }
	            } while (this.day < 1 || this.day > 29);
	            this.month = month;
            } else {
                setDay(day);
                this.month = month;
            }
				
		} while (month < 1 || month > 12 || (month == 2 && (day < 1 || day > 29))) ;
		setYear(year);
	}

	
	// YEAR 
	public int getYear() {
		return year; 
	}
	public void setYear(int year) {
		do {
			if (year < 0) {
	            System.out.println("Invalid input for year. Please enter a value greater than or equal to 0.");
	        } else {
	            this.year = year;}
		} while (year < 0);
	}
	
	// PRINTING A DATE 
	public void printDate() {
	    String f_date = String.format("%02d/%02d/%d", day, month, year);
	    System.out.println(f_date);
	}
}

		

	
	



		
