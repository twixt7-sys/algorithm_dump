
// Print the multiplication table with color

public class prob4 {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        for(int i = 1; i < 20; i++){
            for(int j = 1; j < 20; j++){
                if(i == 1 || j == 1) System.out.print(GREEN + (i * j) + "\t" + RESET);
                else System.out.print(YELLOW + (i * j) + "\t" + RESET);
            }
            System.out.println();
        }
    }
}
