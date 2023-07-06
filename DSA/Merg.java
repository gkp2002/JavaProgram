public class Merg {
   // public static String mergeAlternately(String word1, String word2) {
           
        //  String word=" ";
        //  for(int i=0;i<word1.length();i++){
        //      if(i<word1.length())
        //      word+=word1.charAt(i);
        //      if(i<word2.length())
        //      word+=word2.charAt(i);
        //  }
        //    return word;

     public static String merge(String s1, String s2)
    {
        // To store the final string
        StringBuilder result = new StringBuilder();
  
        // For every index in the strings
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
  
            // First choose the ith character of the
            // first string if it exists
            if (i < s1.length())
                result.append(s1.charAt(i));
  
            // Then choose the ith character of the
            // second string if it exists
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
  
        return result.toString();
    }
        
        //}
        public static void main(String[] args) {
            String s1="abc";
            String s2="pqr";
            System.out.println(merge(s1,s2));
        }
}
