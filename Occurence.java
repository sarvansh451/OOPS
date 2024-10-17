
import java.util.Scanner;

class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        boolean[] counted = new boolean[size];

        for (int i = 0; i < nums.length; i++) {

            if (counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    counted[j] = true;  
                }
            }

            System.out.println(nums[i] + " count = " + count);
        }
        sc.close();
    }
}
