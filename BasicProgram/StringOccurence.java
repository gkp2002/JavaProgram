public class StringOccurence {
    public static int first= -1;
    public static int last= -1;
    public static void find(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first==-1)
                    first = idx;
                    else 
                     last = idx;
                }
            find(str, idx+1, element);
        }
            public static void main(String[] args) {
                String str="abaacdaefaah";
                find(str,0, 'a');
                
            }
    }
    

