public class RotationcountinRSA {
    public static void main(String[] args) {
        int []nums={7, 9, 11, 12, 5};
        System.out.println(Rotationcount(nums));
    }
    static int Rotationcount(int []nums){
        int minvalue=nums[0];
        for(int i=0;i<nums.length;i++){
            if (nums[i]<minvalue){
              minvalue=nums[i];
            return  i;

            }


        }

//return minvalue;

        return  -1;

    }
}
