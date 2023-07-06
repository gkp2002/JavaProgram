public class Pattern52 {
    public static void main(String[] args) {
        int n=5;
        int t;
        int k=n;
        int y;
        for (int i=n; i>=1; i--) {
                 t=k;
                 y=i+1;
            for (int j=n; j>=i; j--) {
                System.out.print(t+" ");
                t-=y;
                y++;
                
    }
    k+=i-1;
    System.out.println();
}
    }
}