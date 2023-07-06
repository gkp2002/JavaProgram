//Print all the subsequence of the STring
public class Subsequence {
    public static void Sequen(String str,int indx,String newstring){
          if(indx==str.length()){
            System.out.println(newstring);
            return;
          }        
        char currChar = str.charAt(indx);
        Sequen(str,indx+1,newstring+currChar);
        Sequen(str,indx+1,newstring);

    }
    public static void main(String[] args) {
        String str="adc";
        Sequen(str,0,"");
    }
}
