const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve([
            {
            name : 'billgates',
            age : 67
        },{
            name : 'mark zuckerberg',
            age :40
        },{
            name : 'jeff',
            age : 45

        }
        ])
    }else{
        reject('failed')
    }
})

message.then(function(msg){
    console.log('success message',msg);
    
}).catch(function(err){
    console.log('failure message',err);
    
})

const employees = new Promise(function(resolve,reject){
    if(400000>300000){
        resolve([
            {
            name : 'billgates',
            age : 67
         
        },{
            name : 'mark zuckerberg',
            age :40
         
        },{
            name : 'jeff',
            age : 45
         
        }
        ])
    }else{
        reject('failed')
    }
})

employees.then(function(data){
    console.log('employee data',data);
    
}).catch(function(err){
    console.log('failure message',error);
})

// closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10;
        return count
    }
    return innerFunction
}
let innerfunc= outerFunction(20)
let counter = innerfunc()
console.log('Counter value',counter);
