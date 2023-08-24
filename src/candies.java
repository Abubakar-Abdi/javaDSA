import java.util.ArrayList;
import java.util.List;

public class candies {
        public static List<Boolean> kidsWithCandies(int extraCandies) {
            int[] candies = new int[]{1, 2, 34, 5};
            List<Boolean> list=new ArrayList<>(candies.length);

            //find the largest
            int largest=Integer.MIN_VALUE;
            for (int j : candies) {
                if (largest < j) {
                    largest = j;
                }
            }

            // checking if children get extra candies
            for(int candy: candies){
                if(candy+ extraCandies>=largest){
                     list.add(true);}
                else{
                     list.add(false);
                }
            }
            return list;
        }
    }
