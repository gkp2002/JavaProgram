public class TawarofHanoi {
   public static void tower(int n,String src,String helper,String dest){
    if(n==1){
           System.out.println("step "+n+" working-> "+src+" -> "+dest);
           return;
        }
                tower(n-1,src,helper,dest);
                 System.out.println("step "+n+" working-> "+src+" -> "+dest);
              tower(n-1,src,dest,helper);
                System.out.println("step "+n+" working-> "+src+" -> "+dest);
                 tower(n-1,helper,src,dest);
   
   }
   public static void main(String[] args){
    int n=3;
    tower(n,"sour","Helper","Dest");
   }
}
//only one disk transfer in 1step
//smaller disks are always kept on top of lager data