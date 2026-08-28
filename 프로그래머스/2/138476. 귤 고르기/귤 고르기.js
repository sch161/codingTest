function solution(k, tangerine) {
    let obj = {};
    
    for(let size of tangerine) {
        if(obj[size]) obj[size]++;
        else obj[size] = 1;
    }
    
    const count = Object.values(obj).sort((a, b) => b - a);
    
    let answer = 0;
    for(let i of count) {
        k -= i;
        answer++;
        
        if(k <= 0) break;
    }
    return answer;
}