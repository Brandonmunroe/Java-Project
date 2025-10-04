import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
      int[] nums = new int[6];
      nums[0] = 20;
      nums[1] = 30;
      nums[2] = 40;
      nums[3] = 50;
      nums[4] = 60;
      nums[5] = 70;

      System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        ArrayList nums2 = new ArrayList();
        nums2.add(20);
        nums2.add(30);
        nums2.add(40);
        nums2.add(50);
        nums2.add(60);
        nums2.add(70);
        nums2.add(80);
        nums2.add(90);
        nums2.add(100);
        nums2.add(120);
        System.out.println(nums2);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);


        ArrayList<String> name = new ArrayList<>();
        name.add("Kieron");
        name.add("Noel");
        name.add("Kevaughnie");
        name.add("Kordell");
        name.add("Tayshaun");
        System.out.println(name);


        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.50);
        prices.add(450.00);
        prices.add(3.25);
        prices.add(91.75);
        prices.add(150.40);
       System.out.println(prices);
        for(double price = 0; price < prices.size(); price++) {
            System.out.println(price);

        }






    }

}

