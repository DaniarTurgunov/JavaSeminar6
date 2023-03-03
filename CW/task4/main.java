package Seminar6.CW.task4;

public class main {
    public static void main(String[] args) {
        double temp = 37.0;
        System.out.println(new Farengeit().convertValue(temp));
        System.out.println(new Kelvin().convertValue(temp));
        System.out.println(new Reynura().convertValue(temp));
        System.out.println(new Celsius().convertValue(temp));
    }
}
