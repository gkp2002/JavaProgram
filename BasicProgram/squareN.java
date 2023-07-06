public class squareN {
    public static int calculatePower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0)
        return 0;
               int xpower1=calculatePower(x, n-1);
               int xpower2=x*xpower1 ;
               return xpower2;
    }
    public static void main(String[] args) { 
       System.out.println( calculatePower(2, 4));
    }
    
}
