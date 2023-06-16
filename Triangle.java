class Triangle{
    public static void main(String args[]){
      // int n=1;
      // for(int i=0;i<5;i++){
      //    for(int j=i;j>0;j--){
      //     System.out.print(n +" ");
      //     n++;
      //    }
      //    System.out.println();

      // }
      for(int i=0;i<5;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j+i-1 + " ");          
        }
        System.out.println();
      }

    }
}