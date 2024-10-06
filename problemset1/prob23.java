// Reversing a string

public class prob23 {
    public static void main(String[] args) {
        String string = "Doggie";

        // Store
        char[] str = string.toCharArray();

        for(int i = 0; i < str.length / 2; i++){
            char temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }

        for(char i: str) System.out.print(i);
    }
}
