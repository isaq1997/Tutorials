import org.jetbrains.annotations.NotNull;

public class test_sort {
    public  static  void swap(int @NotNull []arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }

    static  int pivot(int []arr, int low,int high){
        int pivot=arr[high];
        int j=low-1;
        for(int i=low;i<high;i++){
            if(pivot>=arr[i]) {
                j++;
                swap(arr, j, i);


            }
        }
        swap(arr,j+1,high);

return j+1;
    }

    static  void  quicksort(int []arr, int low,int high){
        if (high>low){
            int pivot=pivot(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);

        }


    }

    public static  void main(String [] args){
int []arr={2,3,4,1,7,88,11,33,14,78};
quicksort(arr,0,arr.length-1);
for (int i=0;i<arr.length;i++) {
    System.out.println(arr[i]);
}

    }
}
