import java.time.DateTimeException;
import java.time.LocalDate;

public class Experience {

    // ATTRIBUTES
    private String type;
    private String title;
    private String establishment;
    private Date start_date;
    private Date end_date;
    private String description;

    // CONSTRUCTOR
    public Experience(String type, String title, String establishment, int s_day, int s_month, int s_year, int e_day, int e_month, int e_year, String description) {
        setType(type);
        setTitle(title);
        setEstablishment(establishment);
        setStart_date(s_day, s_month, s_year);
        setEnd_date(e_day, e_month, e_year);
        setDescription(description);
    }

    // GETTERS AND SETTERS

    // TYPE
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        this.type = type.trim();
    }

    // TITLE
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title.trim();
    }

    // ESTABLISHMENT
    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        if (establishment == null || establishment.trim().isEmpty()) {
            throw new IllegalArgumentException("Establishment cannot be null or empty");
        }
        this.establishment = establishment.trim();
    }

    // START_DATE
    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid start date");
        }
        this.start_date = new Date(day, month, year);
    }

    // END_DATE
    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid end date");
        }
        this.end_date = new Date(day, month, year);
    }

    // DESCRIPTION
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        this.description = description.trim();
    }

    // HELPER METHOD TO CHECK IF A DATE IS VALID
    private boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
