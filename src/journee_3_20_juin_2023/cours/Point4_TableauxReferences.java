package journee_3_20_juin_2023.cours;

public class Point4_TableauxReferences {
    public static void main(String[] args) {
        int[] numbers={3,4,5,6,7,8,9};
        int[] numbers2={3,4,5,6,7,8,9};
        if(numbers==numbers2){
            System.out.println("Test : C'est vrai");
        }else {
            System.out.println("Test : C'est faux");
        }

        int[] numbers3=numbers;
        if(numbers==numbers3){
            System.out.println("Test2 : C'est vrai");
        }else {
            System.out.println("Test2 : C'est faux");
        }
    }
}
