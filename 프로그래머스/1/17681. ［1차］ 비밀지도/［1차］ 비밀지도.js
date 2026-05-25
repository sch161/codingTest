function solution(n, arr1, arr2) {
    let answer = new Array(n).fill('');
    
    for(let i = 0; i < arr1.length; i++) {
        let a1 = arr1[i].toString(2).padStart(n, '0');
        let a2 = arr2[i].toString(2).padStart(n, '0');
        
        for(let j = 0; j < a1.length; j++) {
            if(a1[j] === '1' || a2[j] === '1') {
                answer[i] += "#";
            } else {
                answer[i] += ' ';
            }
        }
    }
    
    return answer;
}