function solution(n) {
    let sum = 0;
    for(let i = 2; i <= n; i++) {
        let isPrime = true;
        for(let j = 2; j <= Math.sqrt(i); j++){
            if(i % j == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) sum++;
    }
    return sum;
}