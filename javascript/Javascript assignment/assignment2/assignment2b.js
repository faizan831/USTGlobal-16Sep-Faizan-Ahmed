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