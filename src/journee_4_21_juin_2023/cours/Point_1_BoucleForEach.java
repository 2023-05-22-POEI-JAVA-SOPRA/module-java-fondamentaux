package journee_4_21_juin_2023.cours;

public class Point_1_BoucleForEach {
    public static void main(String[] args) {
        int[] numbers={2,4,5,7,8,9};
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
