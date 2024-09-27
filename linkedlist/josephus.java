package linked_list;

import java.util.LinkedList;
import java.util.Random;

public class josephus{
    static Random r = new Random();
    public static void main(String[] args){
        LinkedList<String> circle = new LinkedList<>();

        int circle_size = 10;
        int countoff;

        String[] names = {"Napoleon", "Roger", "Allen", "Bryan", "Jason", "Ändrew", "Walter", "Junior", "Ryan", "Kenneth"};
        for(String i: names) circle.add(i);

        circle.set(r.nextInt(9), "Josephus");

        System.out.println("---------------------------------------------");
        System.out.println("               Saving Josephus               ");
        System.out.println("---------------------------------------------");                              delay(1000);

        System.out.println("\nCircleSize:\t\t" + circle_size);
        System.out.println("Josephus' position:\t" + circle.indexOf("Josephus") + "\n");                  delay(1000);

        System.out.println("The countoff will start in: ");                                               delay(1000);
        System.out.println(3);                                                                            delay(1000);
        System.out.println(2);                                                                            delay(1000);
        System.out.println(1);                                                                            delay(1000);

        print_list("Initial Circle", circle_size, circle);                                              delay(3000);

        while(circle_size != 1){
            countoff = r.nextInt(100);
            System.out.println("Countoff value: " + countoff +"\n");                                        delay(1000);
            if(circle.indexOf("Josephus") == countoff % circle_size){
                countoff = r.nextInt(100);
                System.out.println("Countoff value changed to: " + countoff +"\n");                         delay(1000);
            }else{
                int index = countoff % circle_size--;
                System.out.println("The person at index " + index + " is eliminated.");                      delay(1000);
                System.out.println(circle.get(index) + " is now dead.");                                    delay(1000);
                circle.remove(index);
                print_list("People remaining: ", circle_size, circle);                                  delay(1000);
            }
        }

        System.out.println("Josephus survives.");
    }

    public static void print_list(String str, int circle_size, LinkedList<String> list){
        System.out.println("\n" + str + " [size: " + circle_size + "]: ");
        for(String i: list)System.out.print(i + "   ");
        System.out.println("\n");
    }

    public static void delay(int millis){
        try{Thread.sleep(millis);}
        catch(InterruptedException e){}
    }
}