console.log('window object',window);
console.log('this keyword',this);
console.log(this===window);
//window.alert('welcome to java script class')
//alert('welcome UST Global and Test Yantra')
//let confirmDelete=confirm('Are you sure you want to delete')
//console.log('Confirm delete',confirmDelete);
//let userName=prompt('What is your name','Deeksha');
//console.log('user name',userName);

const person = {
    firstName : 'alia',
    age : 26,
    lastName : 'kapoor',
    getName : function(){
        console.log('this keyword',this);
        
        return this.firstName+ '  '+this.lastName
    }
}
let fullName =person.getName()
console.log('full Name',fullName);

