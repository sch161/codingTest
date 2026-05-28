function solution(A,B){
    let answer = 0;
    A.sort((a, b) => a - b);
    B.sort((a, b) => a - b);
    
    while(A.length !== 0) {
        answer += A.shift() * B.pop();
    }
    
    return answer;
}