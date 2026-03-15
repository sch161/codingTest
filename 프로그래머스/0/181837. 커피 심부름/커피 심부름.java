class Solution {
    public int solution(String[] order) {
        int result = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano")) {
                result += 4500;
            } else if(order[i].contains("cafelatte")) {
                result += 5000;
            } else if(order[i].equals("anything")) {
                result += 4500;
            }
        }
        return result;
    }
}