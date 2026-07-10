function solution(n, words) {
    for (let i = 1; i < words.length; i++) {
        const prev = words[i - 1];
        const cur = words[i];
        
        const cutOf = cur[0] !== prev[prev.length - 1];
        const dup = words.slice(0, i).includes(cur);
        
        if(cutOf || dup) {
            return [(i % n) + 1, Math.floor(i / n) + 1];
        }
    }
    
    return [0, 0];
}