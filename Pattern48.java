public class Pattern48 {
    public static void main(String[] args) {
        int k=1;
        int l;
        int m;
        for(int i=5;i>=1;i--){
                  l=i;
                  m=k;
            for(int j=5;j>=i;j--){
                System.out.print(m + " ");
                   m=m-l;
                   l++;
                
            }
            k=k+i;

            System.out.println();
        }
    }
    
}
