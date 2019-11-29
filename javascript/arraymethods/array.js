const hobbies=['sleeping','cricket','eating','coding','roaming'];
console.log(typeof hobbies);
console.log('=====================');
const isArrayorNot = Array.isArray(hobbies)
console.log('Hobbies array or not',isArrayorNot);

console.log('=======================');

const hascricket=hobbies.includes('cricket');
console.log('using include method',hascricket);
//hobbbies.includes('cricket',100);
console.log('======================================');

hobbies.push('guitar','volleyball');
console.log('after push method',hobbies);

console.log('==============================');

hobbies.pop();
console.log('after pop method ',hobbies);

console.log('================================');
hobbies.unshift('numismatics','singing');
console.log('after unishift method ',hobbies);

console.log('=================================');
hobbies.shift();
console.log('after shift method',hobbies);

console.log('=======================================');
/////////////////////////////
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'Bird watching','PUBG');
console.log('after splice method ',hobbies1);
console.log('===================================');
const afterslice=hobbies1.slice(2,4);
console.log('after slice method',hobbies1);
console.log('after slice method',afterslice);

console.log('======================================');
const indexOfCoding=hobbies1.indexOf('coding',1);
console.log('after indexOf method',indexOfCoding);

const joined=hobbies1.join('5');
console.log('after join method',joined);

const numbers=[100,200,300,400];
const num1=numbers.map(function(value,index)
{
    let newValue = value+50;
    return newValue
})
console.log('after map method',num1);
const num2=numbers.map(value=>value+50);
console.log('after map arrow function',num2);
console.log('===============================');

const filterNum=numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('after filter method',filterNum);
console.log('================================================');


const number2=numbers.filter(value=>value>200)
console.log('after filter method using arrow',number2);

const items=[{
    name : 'ear ring',
    id : 1,
    price : 5000,
    },
    {
    name : 'kajal',
    id : 2,
    price : 1000,
    },
    {
    name : 'trimmer',
    id : 3,
    price : 3000,
    },
    {
    name : 'beardo',
    id : 4,
    price : 170,
    }]