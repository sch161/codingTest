function solution(phone_number) {
    let arr = phone_number.split('');
    let answer = '';
    for(let i = 0; i < arr.length - 4; i++) {
        arr[i] = '*';
    }
    for(let i of arr) {
        answer += i;
    }
    return answer;
}