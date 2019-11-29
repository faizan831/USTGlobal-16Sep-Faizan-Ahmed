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