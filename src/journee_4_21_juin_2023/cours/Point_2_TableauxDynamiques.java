package journee_4_21_juin_2023.cours;

import java.util.ArrayList;

public class Point_2_TableauxDynamiques {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("Taille : "+numbers.size());

        numbers.add(23);// 0
        numbers.add(24);// 1
        numbers.add(32);// 2
        System.out.println("Taille apres maj : "+numbers.size());
        System.out.println("Premier element : "+numbers.get(0));
        System.out.println("Dernier element : "+numbers.get(numbers.size()-1));
        numbers.set(1,67);
        System.out.println(numbers.get(1));
//        numbers.remove(1);
        System.out.println(numbers.get(1));
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);
    }
}
