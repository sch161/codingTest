function solution(n) {
    let answer = '';
    let arr = String(n).split('');
    arr = arr.map(Number);
    arr.sort(function (a, b) {
        return b - a;
    });
    for(let i of arr) {
        answer += String(i);
    }
    return Number(answer);
}