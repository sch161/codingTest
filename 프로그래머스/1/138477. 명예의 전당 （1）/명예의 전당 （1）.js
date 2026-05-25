function solution(k, score) {
    let answer = [];
    let h = [];
    
    for(let i of score) {
        h.push(i);
        h.sort((a, b) => a - b);
        if(h.length > k) {
            h.shift();
        }
        answer.push(h[0]);
    }
    
    return answer;
}