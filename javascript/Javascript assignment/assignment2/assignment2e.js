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
