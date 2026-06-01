function solution(s)
{
    let arr = [];
    
    for(let i of s) {
        if(arr.length !== 0 && arr[arr.length - 1] === i) {
            arr.pop();
        } else {
            arr.push(i);
        }
    }
    
    return arr.length === 0 ? 1 : 0;
}