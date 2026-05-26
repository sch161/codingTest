function solution(name, yearning, photo) {
    let answer = [];
    let count = 0;
    
    for(let i = 0; i < photo.length; i++) {
        for(let j = 0; j < photo[i].length; j++) {
            for(let k = 0; k < name.length; k++) {
                if(name[k] === photo[i][j]) {
                    count += yearning[k];
                }
            }
        }
        answer.push(count);
        count = 0;
    }
    return answer;
}