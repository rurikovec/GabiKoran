function birthdayCakeCandles(ar) {
  let sortedArr = ar.sort();
  console.log(sortedArr);
  let candles = 0;
  let i = 0;
  while (sortedArr[ar.length - 1] == sortedArr[ar.length - 1 - i]) {
    candles++;
    i++;
  }
  return candles;
}

let array1 = [1, 5, 6, 2, 3, 5, 6, 6];
console.log(birthdayCakeCandles(array1));
let array2 = [3, 2, 1, 3];
console.log(birthdayCakeCandles(array2));
let array3 = [10, 10, 10, 10, 10, 10, 10, 10, 10, 10];
console.log(birthdayCakeCandles(array3));

let array1000 = [];
for (let i = 0; i < 99999; i++) {
  array1000.push(1000);
}
array1000.push(500);
console.log(array1000.length);
console.log(birthdayCakeCandles(array1000));
