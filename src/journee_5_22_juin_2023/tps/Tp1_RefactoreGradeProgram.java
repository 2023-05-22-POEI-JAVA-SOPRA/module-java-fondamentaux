package journee_5_22_juin_2023.tps;

//public class Tp1_RefactoreGradeProgram {
//    public static void main(String[] args) {
//
//        // Physics
//        double[] physicsGrades={12,11,8,2,7};
//
//        double physicsGradesSum=0;
//        for (double grade: physicsGrades) {
//            physicsGradesSum +=grade;
//        }
//
//        double physicsGradesAverage=physicsGradesSum/physicsGrades.length;
//        System.out.printf("Physics grade sum : %.2f\n",physicsGradesSum);
//        System.out.printf("Physics grade Average : %.2f\n",physicsGradesAverage);
//
//
//        // Geometry
//        double[] geometryGrades={15,13.5,19,11,13};
//
//        double geometryGradesSum=0;
//        for (double grade: geometryGrades) {
//            geometryGradesSum +=grade;
//        }
//        double geometryGradesAverage=geometryGradesSum/geometryGrades.length;
//        System.out.printf("Geometry grade sum : %.2f\n",geometryGradesSum);
//        System.out.printf("Geometry grade Average : %.2f\n",geometryGradesAverage);
//
//        // History
//        double[] historyGrades={19,12.3,13,2,17};
//        double historyGradesSum=0;
//        for (double grade: historyGrades) {
//            historyGradesSum +=grade;
//        }
//        double historyGradesAverage=historyGradesSum/historyGrades.length;
//        System.out.printf("History grade sum : %.2f\n",historyGradesSum);
//        System.out.printf("History grade Average : %.2f\n",historyGradesAverage);
//
//    }
//}


public class Tp1_RefactoreGradeProgram {
    public static void main(String[] args) {
        // Physics
        double[] physicsGrades = {12, 11, 8, 2, 7};
        displayGradeStatistics("Physics", physicsGrades);

        // Geometry
        double[] geometryGrades = {15, 13.5, 19, 11, 13};
        displayGradeStatistics("Geometry", geometryGrades);

        // History
        double[] historyGrades = {19, 12.3, 13, 2, 17};
        displayGradeStatistics("History", historyGrades);
    }

    public static double calculateGradeSum(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double calculateGradeAverage(double[] grades) {
        double sum = calculateGradeSum(grades);
        return sum / grades.length;
    }

    public static void displayGradeStatistics(String subject, double[] grades) {
        double gradeSum = calculateGradeSum(grades);
        double gradeAverage = calculateGradeAverage(grades);

        System.out.printf("%s grade sum: %.2f\n", subject, gradeSum);
        System.out.printf("%s grade average: %.2f\n", subject, gradeAverage);
    }
}

