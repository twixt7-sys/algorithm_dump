
// Farenheit to celsius

public class prob9 {
    public static void main(String[] args) {
        System.out.println(toCelsius(212));
    }
    static double toCelsius(double farenheit){
        return (farenheit - 32) * 5 / 9;
    }
}
