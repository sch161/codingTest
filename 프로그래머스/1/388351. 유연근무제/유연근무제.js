function solution(schedules, timelogs, startday) {
    let answer = 0;
    
    for(let i = 0; i < schedules.length; i++) {
        let hour = Math.floor(schedules[i] / 100);
        let min = schedules[i] % 100;
        let bool = true;
        if(min + 10 >= 60) {
            min -= 60;
            hour++;
        }
        
        for(let j = 0; j < 7; j++) {
            const day = (startday - 1 + j) % 7;
            if(day == 5 || day == 6) {
                continue;
            }
            if(timelogs[i][j] > hour * 100 + min + 10) {
                bool = false;
                break;
            }
        }
        if(bool) {
            answer++;
        }
    }
    return answer;
}