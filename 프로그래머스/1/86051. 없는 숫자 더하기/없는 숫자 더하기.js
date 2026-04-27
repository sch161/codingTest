function solution(numbers) {
    let arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    let answer = 0;
    for(let i of numbers) {
        for(let j = 0; j < arr.length; j++) {
            if(i === arr[j]) {
                arr[j] = 0;
            }
        }
    }
    for(let i of arr) {
        answer += i;
    }
    return answer;
}