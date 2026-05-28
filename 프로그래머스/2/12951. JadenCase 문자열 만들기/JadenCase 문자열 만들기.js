function solution(s) {
    let arr = s.split(' ');
    
    arr = arr.map(word => {
        if (word.length === 0) return word;
        return word[0].toUpperCase() + word.slice(1).toLowerCase();
    });
    
    return arr.join(' ');
}