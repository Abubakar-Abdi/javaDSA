

public class splitarrayHard {
    public static void main(String[] args) {
int []nums={7,2,5,10,8};
        System.out.println("here is the answer");
        System.out.println(splitArray(nums,3));

    }
  static int   splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);//here we getting the max no of partions, which max no in the array
            end=end+nums[i];//this we are getting min no of partitions which is 1 , thus end will equal to the sum of all elements in the array
        }
        //now partitions done
      // we need to use binary search for potential answer
      while(start<end){
          int mid=start+(end+start)/2;
          int sum=0;
          int pieces=1;
          for(int num: nums){
              if((sum+num)>mid){
                  //start new array
                  //the no of pieces doubles
                  sum=num;
                  pieces++;
              }
              else{
                  sum=sum+num;
              }}
          if(pieces>k){
                  start=mid+1;
              }
          else{
                  end=mid;

          }
      }

  return end; // here end=start

    }
}
