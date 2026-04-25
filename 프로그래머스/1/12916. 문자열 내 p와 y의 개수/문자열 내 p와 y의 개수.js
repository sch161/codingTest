function solution(s){
    s = s.toLowerCase();
    let arr = s.split('');
    let p = 0;
    let y = 0;
    for(let i of arr) {
        if(i === 'p') p++;
        if(i === 'y') y++;
    }
    return p === y ? true : false;
}