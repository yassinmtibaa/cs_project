import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class Personal {

    // ATTRIBUTES
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // CONSTRUCTOR
    public Personal(String firstName, String lastName, int age, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setEmail(email);
    }

    // GETTERS AND SETTERS

    // FIRST_NAME
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName.trim();
    }

    // LAST_NAME
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName.trim();
    }

    // AGE
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.age = age;
    }

    // EMAIL
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        // Matches email addresses with optional display name, comments, subdomains, and multiple top-level domains
        Pattern pattern = Pattern.compile("^(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+"
                + "(?:\\.(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+))*"
                + "|\"[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+(?:\\.(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+))*\""
                + ")@"
                + "(?:(?!\\.)[\\p{L}\\d-]+(?:\\.(?:(?!\\.)[\\p{L}\\d-]+))*"
                + "|\\[(?:\\d{1,3}\\.){3}\\d{1,3}\\])$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email.trim();
    }
}
