package journee_4_21_juin_2023.tps;

import java.util.HashMap;

public class TP5_2SumV2 {
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
     * Runtime complexity O(n)
     * @param nums Un tableau d'entiers.
     * @param target La somme cible.
     * @return Un tableau contenant les deux nombres dont la somme est égale à la cible, ou null si aucun couple n'est trouvé.
     */
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {complement, nums[i]};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }
}
