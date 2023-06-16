public class Factorial {
        public static int Fact(int n){
            if(n==0||n==1) {
                return 1;
            }
            int cal=Fact(n-1);
            int ans=cal*n;

           return ans;
            

        }
    public static void main(String[] args) {
           System.out.println( Fact(5));
        }
    
}
