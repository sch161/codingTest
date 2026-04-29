function solution(t, p) {
    let answer = 0;
    for(let i = 0; i < t.length - p.length + 1; i++) {
        let s = t.slice(i, i + p.length);
        if(Number(s) <= Number(p)) {
            answer++;
        }
    }
    return answer;
}