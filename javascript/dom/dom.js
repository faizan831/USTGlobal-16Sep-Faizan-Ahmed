/*let h1Element = document.getElementById('demo')
console.log('element=',h1Element)
console.log('element text=',h1Element.textContent);
h1Element.textContent = 'good evening';
console.log('======================================');

let button=document.createElement('button')
button.textContent='Click me!!!'
console.log('button element',button);

document.body.appendChild(button)
let ulElement=document.createElement('ul')
let li1Element= document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent='java'
li2Element.textContent='sql'
li3Element.textContent='javascript'

ulElement.append(li1Element)
ulElement.append(li2Element)
ulElement.append(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color='red'
h1Element.style.fontSize ='25px'*/


function showMessage(){
    alert('hi hello welcome!!!!')
}

function changeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color='green'
}
function removeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color='blue'
}
function printHello(){
    // console.log('Hello');
    let username=document.getElementById('username').Value
    document.getElementById('showusername').textContent=username;  
}
let name ='faizan'
let age = 21
let phoneno = 7795495076
console.log('name is ',+ name +'age is'+ age +'phoneno'+ phoneno);
console.log(`name is ${name} age is ${age} phone no is ${phoneno}`);
console.log(`2+2= ${2+2} `);
document.getElementById('b1'),disabled=false

