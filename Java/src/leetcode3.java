public class leetcode3 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4,72};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] % 2 == 1) {
                    swap(nums, j, j + 1);

                }


            }


        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

    }
}
