public class max {
    public static int get_max(int[] nums) {
         int def = nums[0];

        for (int num : nums) {
            if (num > def) {
                def = num;

            }
        }

        return def;
    }
    public static int get_min(int[] nums) {

int def=nums[0];
        for (int num : nums) {
            if (num < def) {
                def = num;

            }
        }

        return def;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 7, 5, 11, 0, 122, 89,-8};
        int x = get_max(arr);
        int y=get_min(arr);
        System.out.println(x);
        System.out.println(y);

    }
}
