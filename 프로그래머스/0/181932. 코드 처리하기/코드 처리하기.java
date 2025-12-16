class Solution {
    public String solution(String code) {
        String ret = "";
        String rer = "";
        String idx[] = code.split("");
        int mode = 0;
        for(int i = 0; i < idx.length; i++) {
            if(mode == 0) {
                if(!idx[i].equals("1")) {
                    if(i % 2 == 0) {
                        ret += idx[i];
                    }
                }
                else {
                    mode = 1;
                }
            }
            else {
                if(!idx[i].equals("1")) {
                    if(i % 2 != 0) {
                        ret += idx[i];
                    }
                }
                else {
                    mode = 0;
                }
            }
        }
        if(ret.equals("")) {
            ret = "EMPTY";
        }
        return ret;
    }
}