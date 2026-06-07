function solution(brown, yellow) {
    let carpet = brown + yellow;
    
    for (let i = 3; i < carpet; i++) {
        if (carpet % i === 0) {
            let j = carpet / i;
            if((j - 2) * (i - 2) === yellow) {
                return [j, i];
            }
        }
    }
}