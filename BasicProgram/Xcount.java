//Move all X to the end of string
public class Xcount {
    public static void MoveAllX(String str,int idx,int count,String newString){
              if(idx==str.length()){
                for(int i=0;i<count;i++)
                newString+='x';
                System.out.println(newString);
                return;
              }
        char newChar=str.charAt(idx);
              if(newChar=='x'){
               count++;  
               MoveAllX(str,idx+1,count,newString);
            }else{
                newString += newChar;
                MoveAllX(str,idx+1,count,newString);
            }

    }
    public static void main(String[] args) {
        String str="axbcdxxe";
        MoveAllX(str, 0, 0, "");
    }
}
