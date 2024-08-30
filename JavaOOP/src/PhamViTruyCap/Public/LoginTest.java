package PhamViTruyCap.Public;

import PhamViTruyCap.Protected.Login;

public class LoginTest {
    public static void main(String[] args) {
        Config Config = new Config();
        System.out.println(Config.Browser);

        Login login = new Login();
        System.out.println(login.buttonlogin);
    }
}
