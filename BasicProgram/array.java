import java.util.*;
class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        int value;
        System.out.println("Enter the Value in array:");
        for(int i=0;i<size;i++){
            
            value=sc.nextInt();
            arr[i]=value;
        }
        System.out.print("\n Array Before Reverse: ");
           for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
            
        }
        
        System.out.print("\nprinter arrey after reverse: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(+arr[i]+" ");
         }
            
    }
} 