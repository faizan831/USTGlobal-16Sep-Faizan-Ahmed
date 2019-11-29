console.log('for loops');

var numbers=[1,2,3,4,5,6,7,8,9,10];
for(var i=0;i<=numbers.length;i++)
console.log(i);

console.log('=====================================');
console.log('for in loop for arrays');

for(var index in numbers)
console.log(numbers[index]);
 console.log('for in loop for object');
 var mobile =[{
     brand : 'samsung',
     price : 15000,
 },
 {
 brand : 'nokia',
 price : 20000,
},
{
brand : 'lenovo',
price : 10000,
}]
for(var key in mobile){
    console.log(mobile[key]);
}

console.log(' for of loop');
for(var element of numbers)
console.log(element);

console.log('forEach method');
numbers.forEach(function(value,index){
console.log(value);
});

console.log('--------------------------------------');


