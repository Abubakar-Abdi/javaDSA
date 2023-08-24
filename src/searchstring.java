public class searchstring {
    public static void main(String[] args) {
        String name="Abubakar";
        char target='a';
        System.out.println( search(name,target));

    }


          static boolean search(String name, char target ){
            for(int i=0;i<name.length();i++){

               // char letter=name.charAt(i);
                if (target==name.charAt(i)){
                    return  true;

        }

    }
              return false;
    }

}
