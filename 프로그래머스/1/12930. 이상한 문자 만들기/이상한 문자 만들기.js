function solution(s) {
    let arr = s.split('');
    let idx = 0;
    for(let i = 0; i < s.length; i++) {
        if(arr[i] === ' ') {
            idx = 0;
            continue;
        }
        if(idx % 2 === 0) {
            arr[i] = arr[i].toUpperCase();
        } else {
            arr[i] = arr[i].toLowerCase();
        }
        idx++;
    }
    return arr.join('');
}