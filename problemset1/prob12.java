// Create a function that recieves an array as an argument and returns an array with only positive numbers

public class prob12 {
    public static void main(String[] args) {
        int[] data = {-1245,5,-1245,6,-226,-2637,3,4776,-4568,456,25,26,37,73,26,-69};
        for(int i: getPositive(data))System.out.print(i + "   ");
    }
    static int[] getPositive(int[] data){
        int count = 0;
        for(int i: data) if(i > 0) count++;
        int[] pos_array = new int[count];
        for(int i = 0, index = 0; i < data.length; i++)
            if(data[i] > 0)
                pos_array[index++] = data[i];
        return pos_array;
    }
}
