function solution(s) {
    let arr = s.split('');
    let answer = [];
    for(let i = 0; i < s.length; i++) {
        let found = false;
        for(let j = i - 1; j >= 0; j--) {
            if(arr[i] == arr[j]) {
                answer.push(i - j);
                found = true;
                break;
            }
        }
        if(!found) {
            answer.push(-1);
        }
    }
    return answer;
}