import java.util.*;
public class javalect7 {
    public static void PrintMyName(String Name){
        System.out.println(Name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        PrintMyName(Name);

    }
}
