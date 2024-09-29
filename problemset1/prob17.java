// Calculate thte sum of positive digits of an integer

public class prob17 {
    public static void main(String[] args) {
        System.out.println(calculateSum(14352));
    }
    static int calculateSum(int n){
        String str = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += (int)(str.charAt(i)) % 48;
        }
        return sum;
    }
}
