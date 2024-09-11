import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList01 {

    static void reverseArrayList(ArrayList<Integer> list){

        int i=0;
        int j = list.size()-1;
        int temp = 0;

        while (i<j){

            temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);

            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);

//        reverse order:

//        reverseArrayList(list);
        Collections.reverse(list);
        System.out.println(list);

//        ascending order:

        Collections.sort(list);
        System.out.println(list);

//        Descending Oreder:

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
