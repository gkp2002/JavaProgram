
import java.util.HashSet;
import java.util.Set;
public class Berry {
     public int berry(String str1,String str2){
        int count=0;
        Set <Character> set = new HashSet<>();
        Set <Character> set1 = new HashSet<>();
        for(int i = 0; i < str1.length();i++){
               char n = str1.charAt(i);
                set.add(n);
        }
        for(int i = 0; i < str2.length(); i++){
            set1.add(str2.charAt(i));
        }

          for(char i : set){
              for(char j : set1){
                if(i==j){
                    count++;
                }
              }
          }
        
          if(count<2)
            return 2;
         if(count >=2 && count < 5)
             return 10;
        if(count >5)
        return 15;
          
            

        return -1;

     }
    

    public static void main(String[] args) {
        String str1="berry";
        String str2="codeberry";
        Berry b = new Berry();
      int n=  b.berry(str1,str2);
      System.out.println(n);
        
    }
    
}
