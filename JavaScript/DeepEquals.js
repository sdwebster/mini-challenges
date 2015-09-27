function deepEquals(obj1, obj2){
  if (Array.isArray(obj1)){
    if (Array.isArray(obj2) && obj1.length === obj2.length){
      return obj1.reduce(function(acc, val, i){
        return acc && deepEquals(val, obj2[i]);
      }, true);
    } else {
      return false; 
    }

  } else if (typeof obj1 === "object"){
    if (typeof obj2 === "object" && Object.keys(obj1).length === Object.keys(obj2).length){
      return Object.keys(obj1).reduce(function(acc, key, i){
        return acc && deepEquals(obj1[key], obj2[key]);
      }, true);
    }

  // primitives
  } else {
    return (typeof obj1 === typeof obj2 && obj1 === obj2)
  }
}

var testPairs = [
  [{},{},true],
  [{a:1, b:2, c: [3,2]},{a:1, b:2, c: [3,2]},true],
  [{a:1, b:2},{b:2, a:1}, true],
  [[1,2],[1,3],false],
  [[2,1],[2,1], true],
  [3,3,true],
]


function test(){
  testPairs.forEach(testOnePair);
}

console.log("hi");

function testOnePair(testPair){
  console.log("testing whether " + JSON.stringify(testPair[0]) + " deepEquals " + JSON.stringify(testPair[1]) + ", expecting " + testPair[2] + " and get " + deepEquals(testPair[0], testPair[1]));
}

test();
