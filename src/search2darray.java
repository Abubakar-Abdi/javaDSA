import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int []ans;

        //System.out.println(Arrays.toString(search2D(arr));
    }


        static int search2D(int [][] nums ) {
        int target=5;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    int element = nums[i][j];
                    if (nums[i][j] == target) {
                        return nums[i][j];



                    }

                }

            }
            return-1;
        }
}

