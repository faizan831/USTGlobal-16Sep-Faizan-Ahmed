//Named function
function add(n1,n2){
console.log('sum=',n1+n2);
}
add(10,20);
function add(n1,n2,n3){
    console.log('sum Value',n1+n2+n3);
}
console.log('==========================================');

// function expression(Anonymous)
 var sub = function(n1,n2){
 var subValue = n1-n2;;
 return subValue;
 }
 var value = sub(90,89)
 console.log('value=',value);
console.log('============================================');

 //flat arrow function
 console.log('hello');
 (function(n1,n2){
     console.log('value=',n1*n2);
 }) (10,20)
  
 ///////////////////////////////////////////////////////
 console.log('===============================================');
 var div = (n1,n2)=>{
     console.log('value=',n1/n2);
 }
 div(10,5);

 //////////////////////////////////
 console.log('===============================================');

 var div1= n1=> {
     console.log('value=',n1);
 }
 div1(15);
 
 console.log('==========================================');

 var div2 = n1=>console.log(n1);
 div2(38);
 ////////////////////////////////////////////
 console.log('=================================');
 greeting('faizan')
 function greeting(msg){
     console.log('hello', msg);
 }

////////////////
 console.log('========================================');

 greet('faizan');
 var greet = function(msg){
     console.log('hi',msg);    
 }

 ///////////////////////////
 console.log('============================');
 greets('faizan');
 var greets=(msg)=>{
     console.log('hi',msg);  
 }
 