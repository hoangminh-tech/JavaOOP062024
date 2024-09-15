package TinhDongGoi;

public class Login {
    private String email;
    private String password;
    private String url;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void loginCRM() {
        System.out.println("open URL: " + getUrl());
        System.out.println("enter email: " + getEmail());
        System.out.println("ENTER Password: " + getPassword());
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setUrl("https://www.linkedin.com/feed/");
        login.setEmail("123@gmail.com");
        login.setPassword("1235");

        login.loginCRM();
    }
}
