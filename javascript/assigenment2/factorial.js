var num,i,f=1
function fact(num)
{
    for(i=1;i<=num;i++)
    {
        f=f*i;
    }
    console.log('fact of ',num,' is ',f);    
}
fact(5);

console.log('=============================');
var number
var factorial=function(number)
                {
                    var fac=1
                    for(var i=1;i<=number;i++)
                    {
                        fac=fac*i;
                    }
                    return fac
                }
var val=factorial(5)
console.log('factorial of 5 is ',val);
console.log('==================================');

(function(number){
    var fac=1
    for(var i=1;i<=number;i++)
    {
        fac=fac*i;
    }
    console.log('factorial of ',number,' is ',fac);
    
})(6)

console.log('===============================');
var factorial1=(number)=>{
    var fac=1
    for(var i=1;i<=number;i++)
    {
        fac=fac*i;
    }
    console.log('factorial of ',number,' is ',fac);
}
factorial1(4)

console.log('=====================================');
console.log('fibnocii series');

var f1=0,f2=1;
console.log(0);
console.log(1);
for( var i=1;i<5;i++){
f=f1+f2;
f1=f2;
f2=f;
console.log(f);
}

console.log('================================');
///fibonacci series//////////////////////////////////named function
function fibonacci(num){
    var f1=0,f2=1;num;
    console.log(0);
    console.log(1);
    for( var i=1;i<num;i++){
        f=f1+f2;
        f1=f2;
        f2=f;
        console.log(f);
    }
}
fibonacci(5);
///////////////////////////////////////////////////function expression
var fibonacci=function(num){
    var f1=0,f2=1;num;
    console.log(0);
    console.log(1);
    for( var i=1;i<num;i++){
        f=f1+f2;
        f1=f2;
        f2=f;
        console.log(f);  
    }
}
var series=fibonacci(7);
//////////////////////////////////////////////////self invoke function
(function(num){
    var f1=0,f2=1;num;
    console.log(0);
    console.log(1);
    for( var i=1;i<num;i++){
        f=f1+f2;
        f1=f2;
        f2=f;
        console.log(f);  
    }
})(6)
/////////////////////////////////////////////////fat arrow function
var fibonacci=(num)=>{
    var f1=0,f2=1;num;
    console.log(0);
    console.log(1);
    for( var i=1;i<num;i++){
        f=f1+f2;
        f1=f2;
        f2=f;
        console.log(f);
    }  
}
fibonacci(10);
////////////circumferance of a circle/////////////named function
function circum(radius){
    var circum=2*Math.PI*radius;
    console.log('circumferance of a circle is ',circum);
}
circum(3)
////////////////////////////////////////////////function expressions
var circum=function(radius){
    var circum=2*Math.PI*radius;
    return circum;
}
var value=circum(4);
console.log('circumferance of a circle is ',value);
///////////////////////////////////////////////self invoke function
(function(radius){
    var circum=2*Math.PI*radius;
    console.log('circumferance of a circle is ',circum);
})(10)
//////////////////////////////////////////////fat arrow function
var circum=(radius)=>{
    var circum=2*Math.PI*radius;
    console.log('circumferance of a circle is ',circum);
}
circum(9)
/////////////////////add number of array//////////////////named function
function sum(input){ 
    var total = 0;
    for(var i=0;i<input.length;i++)
    {                  
        total = total + Number(input[i]);
    }
    console.log('sum of array ',total);
}
sum([1,2,3,4,5]);
/////////////////////////////////////////////function expression
var sum=function(input){
    var total = 0;
    for(var i=0;i<input.length;i++)
    {                  
        total = total + Number(input[i]);
    }
    return total;
}
var value = sum([10,20,40,70,60]);
console.log('sum of array is ',value);
/////////////////////////////////////////////self invoke function
(function(input){
    var total = 0;
    for(var i=0;i<input.length;i++)
    {                  
        total = total + Number(input[i]);
    }
    console.log('sum of array ',total);
})([23,45,76,56,98,12,23])
////////////////////////////////////////////fat arrow function
var sum=(input)=>{
    var total = 0;
    for(var i=0;i<input.length;i++)
    {                  
        total = total + Number(input[i]);
    }
    console.log('sum of array ',total);
}
sum([9,7,5,3,1,10])
////////////////prime number////////////////named function
function Prime(number)
{
    var i,flag=0;
    for(i=2; i <= number/2; i++)
    {
        if(number%i == 0)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        console.log(number,' is prime ');
    }
    else
    {
        console.log(number,' is not prime');
    }
}
Prime(2)
////////////////////////////////////////////function expression
var prime=function(number){
    var i,flag=0;
    for(i=2; i <= number/2; i++)
    {
        if(number%i == 0)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        console.log(number,' is prime ');
    }
    else
    {
        console.log(number,' is not prime');
    }
}
prime(5);
/////////////////////////////////////////////self invoke function
(function(number){
    var i,flag=0;
    for(i=2; i <= number/2; i++)
    {
        if(number%i == 0)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        console.log(number,' is prime ');
    }
    else
    {
        console.log(number,' is not prime');
    }
})(9)
////////////////////////////////////////////fat arrow function
var prime=(number)=>{
    var i,flag=0;
    for(i=2; i <= number/2; i++)
    {
        if(number%i == 0)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        console.log(number,' is prime ');
    }
    else
    {
        console.log(number,' is not prime');
    }
}
prime(11)
