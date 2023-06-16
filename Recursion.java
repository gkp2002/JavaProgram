public class Recursion {
    public static void print(int n){
        if(n==6)
         return;
         System.out.println(n);
         print(n+1);
    }
    public static void sumNatur(int i,int n,int sum){
       if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
       }
        sum+=i;
       sumNatur(i+1,n,sum);
       


    }
    public static void main(String[] args) {
        int n=1;
       // print(n);
       sumNatur(1,5,0);
    }
    
}
