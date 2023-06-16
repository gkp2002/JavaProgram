public class bubbleSelect {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Selection sorting in array
    public   void Selection(int arr[]){
          for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                     smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    //Bubble sorting in array
    public void Bubble(int arr[]){
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
            
               if(arr[j]<arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
    }
    //insertion sorting in array
    public void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    
    public static void main(String args[]){
        bubbleSelect st = new bubbleSelect();

        int arr[]={11,2,6,5,9,7,20,44,3};
        st. Selection(arr);
        System.out.println("Selection Sorting:");
        printArray(arr);
        st.Bubble(arr);
        System.out.println("Bubble Sorting:");
        printArray(arr);
        st.Insertion(arr);
        System.out.println("INSERTION Sorting:");
        printArray(arr);

    }
}
