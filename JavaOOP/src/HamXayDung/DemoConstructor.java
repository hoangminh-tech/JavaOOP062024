package HamXayDung;

import java.util.Stack;

public class DemoConstructor {
    public static String name;
    public static String phone;

    public static String address = "123 ABC";
    //Hàm xây dựng có tên giống Class
     DemoConstructor(){
        name ="Minh";
        phone = "01325466778";
    }

//    public static void demo ()
//    {
//        System.out.println(name= "123");
//        System.out.println(phone = "Ơ90912354");
//    }



    public static void main(String[] args) {

        //khởi tạo đối tượng Class là đã chạy luôn hàm xây dựng
        DemoConstructor demoConstructor = new DemoConstructor();

        System.out.println(demoConstructor.name);
        System.out.println(demoConstructor.phone);

        //demo();
    }
}
