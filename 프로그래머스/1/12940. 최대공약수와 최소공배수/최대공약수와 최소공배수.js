function solution(n, m) {
    let arr = [];
    
    const gcd = (n, m) => {
        while(m !== 0) {
            let temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    
    const lcm = (n, m) => {
        return (n * m) / gcd(n, m);
    }
    
    arr.push(gcd(n, m));
    arr.push(lcm(n, m));
    return arr;
}