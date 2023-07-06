//Print all the unique susequence of string
import java.util.*;
public class Subsequence2 {
   public static void Sequen(String str,int indx,String newstring,HashSet<String>set){
          if(indx==str.length()){
            if(set.contains(newstring)){
                return;
            }else{

                System.out.println(newstring);
                set.add(newstring);
            return;
          }    
        }    
        char currChar = str.charAt(indx);
        Sequen(str,indx+1,newstring+currChar,set);
        Sequen(str,indx+1,newstring,set);

    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        Sequen(str,0,"",set);
    }
}

