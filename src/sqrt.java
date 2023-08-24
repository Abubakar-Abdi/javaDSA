public class sqrt {
    public static void main(String[] args) {
int x=49;
int mid=Integer.MAX_VALUE;

int ans=mySqrt(x);
        System.out.println(ans);
    }


    static int mySqrt(int x){
        int start=0;
        int end=x;
        while( start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==x ||mid*mid*mid==x ){
                return mid;
            }
            else if(mid*mid*mid<x || mid*mid*mid<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
