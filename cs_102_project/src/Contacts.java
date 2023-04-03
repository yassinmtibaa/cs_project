import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacts {

    // ATTRIBUTES
    private String phoneNumber;
    private String email;
    private String socialMedia;

    // Constructor
    public Contacts(String phoneNumber, String email, String socialMedia) {
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setSocialMedia(socialMedia);
    }

    // GETTERS AND SETTERS

    // PHONE_NUMBER
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    // EMAIL
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    // SOCIAL_MEDIA
    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        if (!isValidSocialMedia(socialMedia)) {
            throw new IllegalArgumentException("Invalid social media handle");
        }
        this.socialMedia = socialMedia;
    }

    // VALIDATORS

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Matches 10-digit phone numbers with optional area code and country code
        Pattern pattern = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private boolean isValidEmail(String email) {
        // Matches email addresses with optional display name, comments, subdomains, and multiple top-level domains
        Pattern pattern = Pattern.compile("^(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+"
                + "(?:\\.(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+))*"
                + "|\"[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+(?:\\.(?:(?!\\.)[\\p{L}\\d!#$%&'*+\\/=?^_`{|}~-]+))*\""
                + ")@"
                + "(?:(?!\\.)[\\p{L}\\d-]+(?:\\.(?:(?!\\.)[\\p{L}\\d-]+))*"
                + "|\\[(?:\\d{1,3}\\.){3}\\d{1,3}\\])$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidSocialMedia(String socialMedia) {
        // Matches social media handles consisting of alphanumeric characters and underscores
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");
        Matcher matcher = pattern.matcher(socialMedia);
        return matcher.matches();
    }
}

