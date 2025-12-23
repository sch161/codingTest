class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int m = Integer.MAX_VALUE;
            for (int z = queries[i][0]; z <= queries[i][1]; z++) {
                if (arr[z] > queries[i][2] && arr[z] < m) {
                    m = arr[z];
                }
            }
            if(m == Integer.MAX_VALUE) {
                result[i] = -1;
            } else {
                result[i] = m;
            }
        }
        return result;
    }
}
