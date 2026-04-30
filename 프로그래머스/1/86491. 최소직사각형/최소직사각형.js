function solution(sizes) {
    let maxW = 1;
    let maxH = 1;
    for(let i = 0; i < sizes.length; i++) {
        if(sizes[i][1] > sizes[i][0]) {
            let c = 0;
            c = sizes[i][1];
            sizes[i][1] = sizes[i][0];
            sizes[i][0] = c;
        }
        if(maxH < sizes[i][0]) {
            maxH = sizes[i][0];
        }
        if(maxW < sizes[i][1]) {
            maxW = sizes[i][1];
        }
    }
    return maxH * maxW;
}