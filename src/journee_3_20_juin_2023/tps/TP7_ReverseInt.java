package journee_3_20_juin_2023.tps;

public class TP7_ReverseInt {
    public static void main(String[] args) {
        int number=100;
        String numberToStr=Integer.toString(number).replaceAll("[^0-9]","");//retirer le "-"

        StringBuilder reversedStr= new StringBuilder();
        for(String letter:numberToStr.split("")){
            reversedStr.insert(0, letter);
        }

        int reversedToInt=(int) (Integer.parseInt(reversedStr.toString())*Math.signum(number));
        System.out.println(reversedToInt);
    }
}
