function solution(s) {
    let answer = [0, 0];
    
    while(s !== '1') {
        let maxL = s.length;
        s = s.replace(/0/g, '');
        let minL = s.length;
        
        answer[1] += maxL - minL;
        
        s = s.length.toString(2);
        answer[0]++;
    }
    
    return answer;
}