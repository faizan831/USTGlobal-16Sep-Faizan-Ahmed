/*function first(){
    setTimeout(function(){
        console.log('first function execuited');
    },5000)
}
function second(){
    console.log('second function execuited');
}
first()
second()*/
//////////////////////////////////////////////////
/*
console.log('====================================================');

function first(){
    setTimeout(function(){
        console.log('first function execuited');
    },5000)
    console.log('executed');
    
}
function second(){
    console.log('second function execuited');
}
first()
second()
console.log('====================================================');*/

////////////////////////////////////////////
console.log('collbackfunction');

function first(callfunc){
    setTimeout(function(){
        console.log('first function execuited');
        callfunc();
    },5000)
    //console.log('executed');
    
}
function second(){
    console.log('second function execuited');
}
first(second);
