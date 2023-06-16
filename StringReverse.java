public class StringReverse {
   public static void Printreverse(String str,int index){
    if(index==-1){
   return;
    }
        System.out.print(str.charAt(index));
    Printreverse(str,index-1);

   }
    public static void main(String[] args) {
        String str="Hello";
Printreverse(str, str.length()-1);
    }
}
