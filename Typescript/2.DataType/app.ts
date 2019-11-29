//syntax 1
let myName : string = "faizan";
console.log(myName,typeof myName);

//syntax 2
let age : number;
console.log(age,typeof age);

//syntax 3
let mobileNumber = 7795495076;
console.log(mobileNumber,typeof mobileNumber);

//syntax 4
let address;
address=6789;
address = "faizan";
console.log(address ,typeof address);
let calAge = function() : void{
    console.log("age is 26");
    
}
calAge();

class Person1{
    constructor(public name :string ,public age : number){

    }
}
let person1=new Person1("faizan",22);
console.log(person1);
class student extends Person1{
    constructor(public name : string , public age : number , public rollNumber : number){
        super(name ,age);
    }
}
let student1=new student("faizan",22,36);
console.log(student1);

