public class QuickSort {
    public static int partition(int arr[],int low,int hight){
        int pivot=arr[hight];
        int i=low-1;
        for(int j=low;j<hight;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[hight];
        arr[hight]=temp;
        return i+1;
    }
     public static void Sort(int arr[],int low,int hight){
        if(low<hight){
                    int pivot=partition(arr,low,hight);
                    Sort(arr,low,pivot-1);
                    Sort(arr,pivot+1,hight);
                }
     }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        Sort(arr, 0, n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

//quick sort time complexity
//worst case O(n^2)
//Average case O(nlogn)