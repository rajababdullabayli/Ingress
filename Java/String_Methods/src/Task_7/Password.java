package Task_7;

public class Password {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordValid(String password){
        if (password.length()>=8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*")){
            return true;
        }
        else {
            return false;
        }
    }
}
