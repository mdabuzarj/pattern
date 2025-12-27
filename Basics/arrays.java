import java.util.Scanner;

public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // type array name = new type again[size]
        int number[] = new int [size];
        for(int i=0;i<size;i++){
            System.out.println(i);
        }
    }
}
