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