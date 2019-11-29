var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('for of loop');

for(var element of brands){
    console.log('brand=',element);
}
console.log('========================================');

for(var index in brands){
    console.log('brand',brands[index]);
}
console.log('==========================================');

///////////////////////////////
console.log('for in loop for object');
var person ={
        name : 'sundari',
        age : 33,
        color : 'white',
}
for(var key  in person){
    console.log('brand',person[key]);
}

////////////////////// 
console.log('==============================');
console.log('for Each method of array');
var movies = ['sholay','mayabazar','jurassic park','titanic'];
movies.forEach(function(value,index){
    console.log('movie=',value);
    console.log('movie index=',index);     
})

//////////////////////////////////////
console.log('=========================================');

var items =[{
    item :'watch',
    id : 1,
    price : 100
},
{
item : 'bike',
id : 2,
price : 100000
},
{
    item : 'bangles',
    id : 3,
    price : 100
},
{
    item : 'eyeliner',
    id : 4,
    price : 100
}]
items.forEach(function( id,price){
    console.log('item=',id);
    console.log('item price=',price);  
})

///////////////////////////////////////////
console.log('==============================================');
var number =[ 10 , 20 , 30, , 40]

for(var i=0;i<number.length;i++)
console.log('for loop',number[i]);
/////////////////////////////////
console.log('=========================');
number['hundred']= 100;
for(var i in number){
console.log('for in loop',number[i]);
}
console.log('====================================');

console.log(name);// hoisting allowed
var name;
var name = 'pailwan';
var name = 'prasthanam';

console.log('=================================');

//console.log(name1); no hoisting 
let name1 ;
//let name1 = 'saaho';  no redeclaration
name1 = ' valmiki';

console.log('======================================');

//const name2; declaration with initailization is mandatory
const name2 = ' dream girl'
//name2 = 'kiber singh'; no re-assiagning is allowed 

for(let i1=0;i1<5;i1++){
    console.log('inside for loop',i1);    
}
//console.log('outside for loop',i1);
