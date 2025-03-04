window.onload = function () {
    let count = localStorage.getItem('visitorCount');
    if (count === null) {
        count = 0;
    } else {
        count = parseInt(count);
    }

    count++;
    localStorage.setItem('visitorCount', count);
    document.getElementById('visitorCounter').innerText = count;
};