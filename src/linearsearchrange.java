public class linearsearchrange {
    public static void main(String[] args) {
        int [] arr={11,44,55,66,77};
int target=44;
        System.out.println( linearrange(arr, 11));
    }

    static int linearrange(int []nums,int target){
        //start=0;
       // end=nums.length-1;
         target=77;
        for (int i=0;i<nums.length;i++){
            int element=nums[i];
            if(element==target){
                return i;

        }

    }
        return -1;}


}
