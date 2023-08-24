

public class evendigits {
    public static void main(String[] args) {
        int [] nums;
        nums =new int[]{12,345,2,6,7896};


        //System.out.println(findNumbers(nums));
        System.out.println(digits(77));



    }

    static  int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        // System.out.println("count="+count);
        return  count;
    }
    static boolean even(int num){
        int numberofdigits=digits(num);
        return  numberofdigits % 2 == 0;
    }
    static int  digits(int num){
        return (int)(Math.log10(num)+1);
    }


//    static int digits(int num){
//        int count=0;
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        while(num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
//    }

}
