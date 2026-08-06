package Task_5;

public class Email {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername(String email) {
        String userName = email.substring(0,email.indexOf("@"));
        return userName;
    }
    public String getDomain(String email) {
        String domain = email.substring(email.indexOf("@") + 1);
        return domain;
    }

    public boolean isGmail(String email) {
        return email.endsWith("@gmail.com");
    }
}
