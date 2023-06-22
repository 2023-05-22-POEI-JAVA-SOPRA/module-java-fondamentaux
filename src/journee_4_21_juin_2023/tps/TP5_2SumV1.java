package journee_4_21_juin_2023.tps;

public class TP5_2SumV1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        if(result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

    /**
     * Trouve deux nombres dont la somme est égale à la cible.
     * Time complexity : O(n^2)
     * @param nums Un tableau d'entiers.
     * @param target La somme cible.
     * @return Un tableau contenant les deux nombres dont la somme est égale à la cible, ou null si aucun couple n'est trouvé.
     */
    public static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return null;
    }
}
