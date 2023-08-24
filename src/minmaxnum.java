public class minmaxnum {
    public static void main(String[] args) {
        int []arr={1,2,-1,0,5,111116,7,89};
        minmax(arr);
    }

    static void minmax(int []nums){
        int min;
        int max;
        max=nums[0];
        min=nums[0];
        for(int i=0;i<nums.length;i++) {
            int element = nums[i];
            if (element > max) {
                max = element;
                // System.out.println("maximum="+max);
            } else if (element < min) {
                min = element;
            }
            //  System.out.println("manimum="+min);}


        }


        System.out.println("maximum="+max+ "minumum="+min);


        }}





