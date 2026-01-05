public class bitmani {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int Bitmask = 1<<pos;
        // claer 
        int clarbm = ~(Bitmask);
        int newnumber = clarbm & n;
        System.out.println(newnumber);

    }
    
}
