function solution(n) {
    
    let s = n.toString(2).replace(/0/g, '').length;
    let a = 0;
    
    while(s != a) {
        n++;
        a = n.toString(2).replace(/0/g, '').length;
    }
    
    return n;
}