package TinhKeThua;

public class Student extends Person{

    private String phone;
    private String address;

    public Student(String name, int age, float height, String phone) {
        super(name, age, height);//truyền data ngược về class cha
        this.phone = phone;
        this.address = "HCM";
    }

    public void showinfo(){
        super.getInfo();//dùng super để lấy thành phần từ class cha khi bị trùng với class con
        getInfo(); //từ class con
        //System.out.println("Số điện thoại là: "+phone);
        //System.out.println("Địa chỉ của mình là: "+address);
    }

    //ghi đè phương thức từ class cha
    public void getInfo(){
        System.out.println("Số điện thoại là: "+phone);
        System.out.println("Địa chỉ của mình là: "+address);
    }

    public static void main(String[] args) {
        Student std= new Student("Minh", 30, 330, "0909231233");
        std.showinfo();
        //std.getInfo();
        //std.showinfo();
    }
}
