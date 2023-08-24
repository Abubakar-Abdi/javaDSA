public class twosum {
    public static void main(String[] args) {
        int []nums={1,2,3};
        int target=4;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
            if ((nums[i])+(nums[j+1])==target){
                System.out.println("num1"+     nums[i] +"num2"+   nums[j]);

            }
        }}



    }
}
