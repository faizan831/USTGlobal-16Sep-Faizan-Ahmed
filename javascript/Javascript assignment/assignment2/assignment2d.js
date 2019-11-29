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