import java.util.Scanner;

public class Main {

    public static int findMissing(int[] nums) {
        int n = nums.length;
        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] nums = new int[n];


        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMissing(nums);
        System.out.println(result);
    }
}