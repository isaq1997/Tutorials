

public class Bubble {

   public static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

   }

   public static int[] bubble(int[]arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1;j++){
               if (arr[j+1]<arr[j]){
                   swap(arr,j+1,j);

               }
           }
       }

   return arr;
   }
    public static  void main(String[] args){
    int []arr={4,3,2,6,77,34,11,8};
    bubble(arr);
    for (int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
     }
   }
}
