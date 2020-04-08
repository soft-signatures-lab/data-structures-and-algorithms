
function sortByFrequency(array) {
    const store = [];
    const result = [];
    const map = {};
    array.forEach((el, i) => {
        if (el in map) {
            map[el]++
        } else {
            map[el] = 1;
        }
    })

    for (el in map) {
        store.push([el, map[el]]);
    }

    store.sort(function(a, b) {
        return b[1] - a[1]
    })

    store.forEach((el) => {
        for (let k = 0; k < el[1]; k++) {
            result.push(el[0]);
        }
    })


    return result;
}

