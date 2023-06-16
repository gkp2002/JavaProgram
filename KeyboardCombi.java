public class KeyboardCombi {
    public static String[] keyboard ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombi(String str,int idx,String combination){
          if(idx==str.length()){
            System.out.println(combination);
            return;
          }
        char currChar = str.charAt(idx);
        String mapping = keyboard[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombi(str, idx+1, combination+mapping.charAt(i));
        } 

    }
    public static void main(String[] args) {
        String str= "21";
        printCombi(str,0,"");
        
    }
    
}
