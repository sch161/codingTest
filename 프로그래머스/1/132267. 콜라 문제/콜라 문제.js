function solution(a, b, n) {
    let answer = 0;
    
    while (n >= a) {
        let emptyBottle = Math.floor(n / a);
        answer += emptyBottle * b;
        n = (n % a) + emptyBottle * b;
    }
    
    return answer;
}