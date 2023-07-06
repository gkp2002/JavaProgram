class BackTracking{
    public static void Permutation(String str,String Perm,int indx){
        if(str.length()==0){
            System.out.println(Perm);
            return;
        }
        for(int i=0;i<str.length();i++){
        char currChar = str.charAt(i);
        String newchar = str.substring(0,i)+str.substring(i+1);
        Permutation(newchar,Perm+currChar,indx+1);
        }

    }
    public static void main(String[] args) {
        String str= "ABC";
        Permutation(str, "", 0);


    }
}