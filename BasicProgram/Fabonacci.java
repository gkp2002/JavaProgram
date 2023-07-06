public class Fabonacci {
    public static void fabo(int a,int b,int n){
        if(n==1) return;     
        int c=a+b;
             System.out.println(c);
             fabo(b,c,n-1);

    }
    public static void main (String[] args) {
      int a=0;
      int b=1;
      int n=7;
        fabo(a,b,n);
    }
}
