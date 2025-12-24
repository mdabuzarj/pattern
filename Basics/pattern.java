import java.util.*;
public class pattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 5;
        int number =1;


        //nested loops
        //solid rect
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //hollow rect
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1|i==n||j==m){
                    System.out.print("*"); 
                 }else {
                    System.out.print(" ");
                } 
                
            } 
            System.out.println(); 
        }  
        //half pyramid  
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //invert pyramid
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted pyramid 180.
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //number pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        
        // invert number pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //floyd traingle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+"");
                number++;
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        //butterfly pattern
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2* (n-i);
            for(int j=1;j<=space ;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2* (n-i);
            for(int j=1;j<=space ;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //solid rhombus 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

