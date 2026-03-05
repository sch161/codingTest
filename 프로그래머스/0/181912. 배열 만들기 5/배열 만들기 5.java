import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++) {
            
            String x[] = intStrs[i].split("");
            String z = "";
            
            for(int j = s; j < s + l; j++) {
                z += x[j];
            }
            
            int z1 = Integer.parseInt(z);
            if(z1 > k) {
                result.add(z1);
            }
        }
        
        int[] arr1 = new int[result.size()];
        for (int i = 0 ; i < result.size() ; i++) {
	        arr1[i] = result.get(i).intValue();
        }
        
        return arr1;
    }
}