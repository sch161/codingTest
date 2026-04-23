function solution(num, total) {
    let arr = new Array(num);
    arr[0] = ((2*total - num*num + num) / (2*num));
    for(let i = 1; i < arr.length; i++) {
        arr[i] = arr[i - 1] + 1;
    }
    return arr;
}