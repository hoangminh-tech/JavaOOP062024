package TinhDaHinh;

public class calculator     {
    public double tinhtong(double a, double b){
        return a+b;
    }
    public double tinhtong (double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.tinhtong(10, 29));
        System.out.println(cal.tinhtong(12,22));
    }
}
