import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int m = n;
        ArrayList<Integer> x = new ArrayList<>();
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                x.add(n);
            } else {
                n = 3 * n + 1;
                x.add(n);
            }
        }
        int[] arr = new int[x.size() + 1];
        arr[0] = m;
        for (int i = 0; i < x.size(); i++)
            arr[i + 1] = x.get(i).intValue();
        return arr;
    }
}