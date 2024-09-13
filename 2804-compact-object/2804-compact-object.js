/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(Array.isArray(obj)){
        return obj.reduce((acc,item)=>{
            const compactedItem = compactObject(item);
            if(compactedItem){
                acc.push(compactedItem);
            }
            return acc;
        },[]);
    }else if(typeof obj ==='object' && obj!== null){
        return Object.keys(obj).reduce((acc,key)=>{
            const value = compactObject(obj[key]);
            if(value){
                acc[key] = value;
            }
            return acc;
        },{})
    }
       else{
            return obj;
        }
};