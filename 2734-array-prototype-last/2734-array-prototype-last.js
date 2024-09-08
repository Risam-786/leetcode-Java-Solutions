/**
 * @return {null|boolean|number|string|Array|Object}
 */

Array.prototype.last = function() {

    if (this.length > 0) {

        return this[this.length - 1];
    } else {

        return -1;
    }
};


const nums1 = [null, {}, 3];
console.log(nums1.last()); 

const nums2 = [];
console.log(nums2.last()); 
/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */