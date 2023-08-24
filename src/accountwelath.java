public class accountwelath {
    public static void main(String[] args) {
    int [][] accounts={{1,10,1},{40,1,1}};
        int ans =maximumWealth( accounts);
        System.out.println(ans);


    }

  static  int maximumWealth(int[][] accounts) {

      int max=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int person_sum=0;
            for(int account=0;account<accounts[person].length;account++){
                person_sum=person_sum+accounts[person][account];

            }

            if (person_sum>max){
                max=person_sum;
            }
        }
      return max;
    }

}
