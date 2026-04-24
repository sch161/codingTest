function solution(x, n) {
    let y = x;
    let arr = new Array(n);
    for(let i = 0; i < n; i++) {
        arr[i] = x;
        x += y;
    }
    return arr;
}