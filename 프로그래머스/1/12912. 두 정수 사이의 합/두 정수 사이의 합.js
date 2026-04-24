function solution(a, b) {
    let sum = 0;
    if(b < a) {
        let c = 0;
        c = a;
        a = b;
        b = c;
        
    }
    for(let i = a; i <= b; i++) {
        sum += i;
    }
    return sum;
}