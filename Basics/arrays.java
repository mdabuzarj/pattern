import java.util.*;

public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // type array name = new type again[size]
        int number[] = new int [size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();

        }
        int x = sc.nextInt();

        //output  with length key for size of array
        for(int i=0;i<number.length;i++){
            if(number[i] == x){
                System.out.println("array no found in index:" + i);
            }
        }

    }
}
