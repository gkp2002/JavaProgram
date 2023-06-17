public class MergeSort {
    public static void merged(int arr[],int start,int mid,int end){
        int merge[]=new int [end - start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }
            else {
                merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
             merge[x++]=arr[idx1++];
        }
        while(idx2<=end){
             merge[x++]=arr[idx2++];
        }
            for(int i=0,j=start;i<merge.length;i++,j++){
                arr[j]=merge[i];
            }

    }
    public static void divide(int arr[],int start,int end){
        int mid=start+(end - start)/2;
        if(start>=end) return;
    divide(arr,start,mid);
    divide(arr,mid+1,end);
    merged(arr,start,mid,end);
    }
    public static void main(String[] args) {
      int arr[]={6,3,8,5,9,2};
      int n=arr.length;    
      divide(arr, 0, n-1);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    
}
