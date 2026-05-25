function solution(s, n) {
    let answer = '';
    for(let i = 0; i < s.length; i++) {
        let uc = s.charCodeAt(i);
        if(uc === 32) {
            answer += ' ';
        }
        else if(uc >= 65 && uc <= 90) {
                answer += String.fromCharCode(
                    (uc - 65 + n) % 26 + 65
                );
        } else if(uc >= 97 && uc <= 122) {
                answer += String.fromCharCode(
                    (uc - 97 + n) % 26 + 97
                );
        }
    }
    return answer;
}