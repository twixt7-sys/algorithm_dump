package sort;

public class InsertionSort{
    public static void main(String[] args) {
        int[] data = {3, 7, 4, 6, 3, 2, 6, 6, 8, 9, 5, 7, 9, 3, 4, 6, 9};

        // for - while    (temp, i, j, j + 1)
        for(int i = 1; i < data.length; i++){               //pointer
            int temp = data[i];                             //temp(tig gunit sa ubos)
            int j = i - 1;                                  //pointer j
            while(j >= 0 && temp < data[j]){                //check kung kinsa ang mas gamay
                data[j + 1] = data[j];                      //switch
                j--;                                        //decrement
            }
            data[j + 1] = temp;                             //insert
        }



        for(int i : data){
            System.out.println(i);
        }
    }
}