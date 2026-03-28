class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int result = 0;
        
        while(true) {
            result += coupon / 10;
            coupon = (coupon / 10) + (coupon % 10);
                
                if(coupon == 0 || coupon / 10 == 0) {
                    break;
                }
        }
        return result;
    }
}