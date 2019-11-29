const person ={
    name : 'sundara',
    age : 100,
    color : 'white',
    address : {
        city : 'Bijapur',
        state : 'karnataka',
        pincode : 591115
    },
    hobbies : ['coding','Bird watching','singing']
}
console.log('JavaScript person object',person);
const jsonObject = JSON.stringify(person)
console.log('JSON person object ', jsonObject);

const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person object after parse',javaScriptPersonObject);
localStorage.setItem('email','billgates@gmail.com')
const emailID= localStorage.getItem('email')
console.log('Email ID',emailID);
localStorage.clear();
new Promise

