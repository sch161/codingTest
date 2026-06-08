function solution(progresses, speeds) {
    let result = [];
    
    let arr = [];
    
    let cnt = 0;
    while(cnt < progresses.length) {
        let day = 0;
        while(progresses[cnt] < 100) {
            progresses[cnt] += speeds[cnt];
            day++;
        }
        arr.push(day);
        cnt++;
    }
    
    let i = 0;
    while(i < arr.length) {
        let a = arr[i];
        let count = 1;
        i++;
        
        while(i < arr.length && arr[i] <= a) {
            count++;
            i++;
        }
        
        result.push(count);
    }
    
    return result;
}