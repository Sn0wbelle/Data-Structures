public class Lab1 {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static double average(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return (double) total / nums.length;
    }

    public static int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        System.out.println();

        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println();

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println(max(4, 7));
        System.out.println(min(4, 7));
        System.out.println(sum(numbers));
        System.out.println(average(numbers));
        System.out.println(max(numbers));
        System.out.println(min(numbers));
    }
}
