/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    let arr = this;
    let groupedObj = {};
    for(let i = 0; i<arr.length; i++){
        let key = fn(arr[i]);   
        groupedObj[key] ? groupedObj[key].push(arr[i]) :  groupedObj[key] = [arr[i]];
    }
    return groupedObj;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */