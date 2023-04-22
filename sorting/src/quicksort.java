public class quicksort {
    public static  void swap(int[]arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public  static int partition(int[] arr, int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return  i+1;
    }
    public static  void quicksort(int[]arr,int low, int high){
        if (high>low){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        int []arr={2,3,4,1,7,88,11};
     quicksort(arr,0, arr.length-1);
     for(int i=0;i<arr.length;i++){
         System.out.println((arr[i]));
     }
    }
}
