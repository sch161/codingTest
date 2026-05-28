function solution(s) {
    let arr = s.split(' ');
    let answer = '';
    answer += Math.min(...arr) + ' ';
    answer += Math.max(...arr);
    
    return answer;
}