package PhamViTruyCap.Protected;

import PhamViTruyCap.BasePage.Basepage;

import java.sql.Driver;

public class DashBroadPage extends Basepage{

    public void getDriver(){
        System.out.println(driver);
    }

    public static void main(String[] args) {
        Login DangNhap = new Login();
        System.out.println(DangNhap.inputEmail);
        System.out.println(DangNhap.inputPassword);

        Basepage basepage = new Basepage();
        DashBroadPage DB =new DashBroadPage();
        DB.getDriver();
//        System.out.println(basepage.driver);
    }
}
