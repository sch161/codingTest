function solution(food) {
    let sum = 0;
    for(let i = 0; i < food.length; i++) {
        if(food[i] % 2 != 0) {
            food[i]--;
        }
        food[i] /= 2;
    }
    let result = [];
    for(let i = 1; i < food.length; i++) {
        for(let j = 0; j < food[i]; j++) {
            result.push(i);
        }
    }
    
    
    return result.join('') + "0" + result.reverse().join('');
}