function solution(players, callings) {
    const m = new Map();
    players.forEach((name, i) => m.set(name, i));
    
    for (let name of callings) {
        const j = m.get(name);
        const prev = players[j - 1];

        players[j - 1] = name;
        players[j] = prev;

        m.set(name, j - 1);
        m.set(prev, j);
    }
    return players;
}