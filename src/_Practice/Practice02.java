package _Practice;

public class Practice02 {
    int[] nums2 = {3, 2, 5, 7, 9};
    int target2 = 9;

    public static void main(String[] args) {
        Practice02 practice = new Practice02();
        practice.findIndices(practice.nums2, practice.target2);
    }

    public void findIndices(int[] arr, int target) {
        int[] result = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println("Indices: " + result[0] + ", " + result[1]);
                    return;
                }
            }
        }
        System.out.println("No such indices found.");
    }
}
