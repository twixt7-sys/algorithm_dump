package encryption;

public class ceasar {
    public static void main(String[] args) {
        String str = "Message";
        int key = 4;

        for(int i = 0; i < str.length(); i++){
            System.out.print((char) (str.charAt(i) + key));
        }
    }
}