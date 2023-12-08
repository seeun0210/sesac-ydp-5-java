package _Practice;

public class Practice01 {
    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 4;
        int result = sumLessThan(numbers, target);
        System.out.println("result " + target + ": " + result);
    }

    public static int sumLessThan(int[] nums, int num) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > nums[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
