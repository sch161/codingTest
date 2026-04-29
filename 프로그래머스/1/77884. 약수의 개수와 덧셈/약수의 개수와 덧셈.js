function solution(left, right) {
    let answer = 0;
    for(let i = left; i <= right; i++) {
        let sum = 0;
        for(j = 1; j <= i; j++) {
            if(i % j == 0) {
                sum++;
            }
        }
        if(sum % 2 == 0) {
            answer += i;
        } else {
            answer -= i;
        }
    }
    return answer;
}