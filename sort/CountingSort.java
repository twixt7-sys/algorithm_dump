package sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] data = {52,25,6,27,16,27,38,74,36,57,6,8};

        data = counting_sort(data);

        for(int i: data){
            System.out.print(i + "   ");
        }
    }

    public static int[] counting_sort(int[] data){
        int max_val = data[0];                      //set max_val

        for(int num: data){                        //for each(num-data)
            if(num > max_val){                      //if num > max_val
                max_val = num;                      // mv = n
            }
        }
        
        int[] count = new int[max_val + 1];         // count = new int[mv + 1]

        for(int num : data){                        // for each (num-data)
            count[num]++;                           // increment count
        }

        int index = 0;                              //index

        for(int i = 0; i <= max_val; i++){          //for <= max_val
            while(count[i] > 0){                    //while count i > 0
                data[index++] = i;
                count[i]--;
            }
        }
        return data;
    }
}
