public class maxvalarray {
    public static void main(String[] args) {
        int []arr={90,6,7,4,12,30};
    int mm=0;

        System.out.println(maxval(arr,mm));

    }
    static int maxval(int []arr, int maxvalue ){
          maxvalue=arr[0];
       // arr[0]= maxvalue;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;

    }
}
