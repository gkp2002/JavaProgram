public class Dublicate {
    public static boolean[] map = new boolean[26];
    public static void PrintD(String str,int indx,String newString,int count){
        if(indx==str.length()){
            System.out.println(newString);
            System.out.println("Total Duplicate:="+count);
            return;
        }
        char currChar = str.charAt(indx);
        if(map[currChar-'a']==true){
            count+=1;
            PrintD(str, indx+1, newString,count);
        }else{
            newString += currChar;
            map[currChar-'a'] = true;
            PrintD(str, indx+1, newString,count);
        }
    }
    public static void main(String[] args) {
        String str = "gajanan";
        PrintD(str, 0, "",0);
        
    }
    
}
