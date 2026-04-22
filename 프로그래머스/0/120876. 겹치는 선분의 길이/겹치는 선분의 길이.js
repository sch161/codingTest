function solution(lines) {
    let count = [];
    for(let i = 0; i < 201; i++) {
        count.push(0);
    }
    
    for(let [start, end] of lines) {
        for(let i = start; i < end; i++) {
            count[i + 100]++;
        }
    }
    let result = 0;
    for(let i = 0; i < 201; i++) {
        if(count[i] >= 2) {
            result++;
        }
    }
    return result;
}