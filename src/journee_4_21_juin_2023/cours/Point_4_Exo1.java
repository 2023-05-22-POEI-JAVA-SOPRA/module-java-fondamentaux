package journee_4_21_juin_2023.cours;

import java.util.ArrayList;
import java.util.Arrays;

public class Point_4_Exo1 {
    // ana -> ana : palindome
    // ressasser -> ressasser : palindrme
    // papa -> apap -> pas un palindrome
    static boolean isPalindrome(String text){
        String formattedStr=text.replaceAll("[^A-Za-z]","").toLowerCase();
        String reversed=reverse(formattedStr);
        return formattedStr.equals(reversed);
    }


    // Space complexity : O(n+n) => O(2n) =>
    // Time complexity : O(1+n+1) => O(2+n) => O(n)
    static String reverse(String text){
        String reversed="";
        for(String letter:text.split("")){
            reversed=letter+reversed;
        }
        return reversed;
    }


    // Time complexity : O(n)
    // Space complexity : O(n)
    static int sum(ArrayList<Integer> numbers){
        int sum=0;
        for(int number:numbers){
            sum +=number;
        }
        return sum;
    }

    // Time : O(n) | O(1)
    // Space : O(1) | O(1)
    static void faisUnTruc(int a){
        for(int i=0;i<200;i++){
            System.out.println(i+a);
        }
    }


    // 1(0,0) 2(0,1) 3(0,2)
    // 4(1,0) 5(1,1) 6(1,2)
    // 7(2,0) 8(2,1) 9(2,2)
    // Time complexity : O(n^2)
    static int sumDiagonals(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    sum +=matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Time complexity : O(n)
    static int sumDiagonalsV2(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){// i = 0
            sum +=matrix[i][i];//i=0
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("An a"));
        System.out.println(isPalindrome("papa"));
        System.out.println(isPalindrome("ressasser"));

        int[][] matrice={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        System.out.println(matrice[0][0]);
//        System.out.println(matrice[2][1]);
        for(int i=0;i<matrice.length;i++){
//            System.out.println(Arrays.toString(matrice[i]));
            for(int j=0;j<matrice[i].length;j++){
                System.out.println(matrice[i][j]);
            }
        }
    }
}