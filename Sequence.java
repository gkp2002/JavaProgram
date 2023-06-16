public class Sequence {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            int k = i-1;
            
            for(int j=0;j<i;j++){
                   System.out.print(k+i +" ");
                   k+=2;
            }
            System.out.println();
        }
    }
}
