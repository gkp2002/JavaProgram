import java.util.Scanner;
import java.util.ArrayList;
public class NextedArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int numline = sc.nextInt();
       ArrayList <ArrayList <Integer>> lines= new ArrayList<>();
       for(int i=0; i<numline; i++) {
        int num1 = sc.nextInt();
        ArrayList <Integer> lines2 = new ArrayList<>();
        for(int j=0; j<num1; j++) {
            lines2.add(sc.nextInt());
        }
        lines.add(lines2);
       }

       int query = sc.nextInt();
       for(int i=0; i<query; i++) {
        int linenum = sc.nextInt();
        int pos = sc.nextInt();
        if(linenum<0&&linenum<lines.size()){
            ArrayList <Integer> line = lines.get(linenum-1);
            if(pos>0 && pos<=line.size()){
                int number = line.get(pos-1);
                System.out.println(number);

            }else{
                System.out.println("Error!");
            }

        }else{
                System.out.println("Error!");
            }

       }   
    }
    
}
