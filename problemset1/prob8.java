// Make a function that converts celsius to farenheit

public class prob8 {
    public static void main(String[] args) {
        System.out.println(toFarenheit(100));
    }
    static double toFarenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
}
