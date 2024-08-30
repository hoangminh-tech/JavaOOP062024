package HamXayDung;

public class HamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;
    public HamXayDungCoThamSo(String name1, String phone1){
        //this chỉ dùng khi có trùng tên giữa bên ngoài và bên trong hàm
        name = name1;
        phone = phone1;
    }

    public HamXayDungCoThamSo(String name1, String phone1, String address1){

        this.name = name1;
        this.phone = phone1;
        this.address = address1;
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo HamXayDungCoThamSo = new HamXayDungCoThamSo( "Minh",  "0909012354");
        System.out.println(HamXayDungCoThamSo.name);
        System.out.println(HamXayDungCoThamSo.phone);

        HamXayDungCoThamSo HamXayDungCoThamSo2 = new HamXayDungCoThamSo( "Hải",  "0909012355");
        System.out.println(HamXayDungCoThamSo2.name);
        System.out.println(HamXayDungCoThamSo2.phone);


        HamXayDungCoThamSo HamXayDungCoThamSo3 = new HamXayDungCoThamSo( "Huy",  "0909012355", "ABC lE lAI");
        System.out.println(HamXayDungCoThamSo3.name);
        System.out.println(HamXayDungCoThamSo3.phone);
        System.out.println(HamXayDungCoThamSo3.address);
    }
}
