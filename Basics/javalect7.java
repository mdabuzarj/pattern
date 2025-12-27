import java.util.*;
public class javalect7 {
    public static void PrintFactorial(int n){
        int Factorial = 1;
        if(n<0){
        System.out.println("invalid input ");
        return;

        }
        for(int i=n;i>=1;i--){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        PrintFactorial(n);


    }   
}
