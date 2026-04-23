function solution(score) {
    let s = [];
    for(let [first, second] of score) {
        s.push((first + second) / 2);
    }
    
    let result = new Array(s.length).fill(1);
    for(let i = 0; i < s.length; i++) {
        for(let j = 0; j < s.length; j++) {
            if(s[i] > s[j]) {
                result[j]++;
            }
        }
    }
    return result;
}