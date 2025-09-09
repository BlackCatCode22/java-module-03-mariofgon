public class ArrayPractice {
    public static void main(String[] args) {
        String [] cars = new String[4];
        cars[0] = "Dodge";
        cars[1] = "Chevy";
        cars[2] = "BMW";
        cars[3] = "Honda";
        System.out.println(cars[0]);

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            System.out.println(" ");
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
