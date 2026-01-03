import java.util.*;
public class lect12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //nextline for full name
        String name1 = sc.next();
        String name2 = sc.next();

        
        //.length() for len of str 
        //System.out.println(name.length());
        if(name1.compareTo(name2)==0){
            System.out.println("str is equal");
        }else{
            System.out.println("str not eqaul");
        }
    }
    
}
