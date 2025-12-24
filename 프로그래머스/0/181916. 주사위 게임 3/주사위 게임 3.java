import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] dice = {a, b, c, d};

        for (int x : dice) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        if (map.size() == 1) {
            int p = a;
            return 1111 * p;
        }
        if (map.size() == 2) {
            int p = 0, q = 0;

            for (int key : map.keySet()) {
                if (map.get(key) == 3) p = key;
                else q = key;
            }
            if (p != 0) {
                return (10 * p + q) * (10 * p + q);
            }
            int[] nums = new int[2];
            int idx = 0;
            for (int key : map.keySet()) {
                nums[idx++] = key;
            }
            int p1 = nums[0], p2 = nums[1];
            return (p1 + p2) * Math.abs(p1 - p2);
        }
        if (map.size() == 3) {
            int q = 1, r = 1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    if (q == 1) q = key;
                    else r = key;
                }
            }
            return q * r;
        }
        int min = 7;
        for (int x : dice) {
            min = Math.min(min, x);
        }
        return min;
    }
}
