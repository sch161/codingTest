function solution(n) {
    let answer = String(n).split("");
    answer = answer.map(Number);
    return answer.reverse();
}