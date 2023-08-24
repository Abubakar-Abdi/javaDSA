import java.util.ArrayList;

public class ArrayListexample {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(5);
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(67);
        list.add(100);
        list.add(34) ;
        list.add(100);
        list.add(34);


        System.out.println(list);
        System.out.println(list.contains(67));
        list.set(1,340);
        System.out.println(list);
    }
}
