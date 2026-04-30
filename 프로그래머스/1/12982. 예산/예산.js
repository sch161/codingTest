function solution(d, budget) {
    d = d.sort((a, b) => a - b);
    let answer = 0;
    for(let i of d) {
        if(i <= budget) {
            budget -= i;
            answer++;
        }
    }
    return answer;
}