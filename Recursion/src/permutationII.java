import java.util.*;


public class permutationII {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(permuteUnique(nums));
    }



        public static List<List<Integer>> permuteUnique(int[] nums) {
            List<Integer> p = new ArrayList<>();
            List<Integer> up = new ArrayList<>();
            List<List<Integer>> finalList = new ArrayList<>();
            for (int item : nums) {
                up.add(item);
            }
            helper(p, up, finalList);
            return finalList;
        }

        public static void helper(List<Integer> p, List<Integer> up, List<List<Integer>> fl) {
            if (up.isEmpty()) {
                fl.add(new ArrayList<>(p));
                return;
            }

            HashSet<Integer> used = new HashSet<>();
            for (int i = 0; i < up.size(); i++) {
                int item = up.get(i);
                if (used.contains(item)) {
                    continue;
                }

                used.add(item);
                p.add(item);
                up.remove(i);
                helper(p, up, fl);
                p.remove(p.size() - 1);
                up.add(i, item);
            }
        }
    }