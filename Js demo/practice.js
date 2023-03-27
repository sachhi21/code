alert("hii")
console.log("hii");
console.warn("bye");
console.error("good");

let age1=30;
age1 =31; // modification can be performed 
console.log(age1);

const agee=31; // no modification
console.log(agee);


// string , numbers, boolean, null, undefined

const name="hungry";
const age=200;
const rating =4.4;
const iscool=false;
const x=null;
const y=undefined;

console.log(typeof name);


const s=" weilcome to java";
console.log(s.length);
console.log(s.substring(0,5));
console.log(s.substring(0,5).toUpperCase());
console.log(s.split(''));

const s1='sachin, code, you'
console.log(s1.split(', '));

const numb= new Array(1,2,3,4,5);
console.log(numb);

const fruits=["appale", "banana", "a", 1];
console.log(fruits);

console.log(fruits[1]);

fruits[4]="eee";
console.log(fruits);

fruits.push('hhh');
console.log(fruits);

fruits.unshift('sac'); //starting index


fruits.pop();
console.log(fruits);

console.log(fruits.indexOf('sac'));

const person={
    firstName: 'Sachin',
    lastName:'rampur',
    age:24,
    subjects:['math','bio','eng'],
    adress:{
        strret:'2nd main',
         city:'bangalore',
        state: 'Ka'
    }
}

console.log(person.age);
//console.log(person.subjects[]);
console.log(person.adress.state);

const {firstName, lastName, adress:{city}}=person;
console.log(city);

person.email='sachin@gmail.com'
console.log(person);


const todos=[
    {
        id:1,
        Text:'sachin',
        ishuman: true
    },
    {
        id:2,
        Text:'sahin',
        ishuman: false
    },
    {
        id:3,
        Text:'achin',
        ishuman: true
    }

];

for(let i=0; i<todos.length; i++){
    console.log(i);

}

for(let todo of todos){
    console.log(todo.Text);
}

for(let i=0; i<10; i++){
    console.log(i);
}

todos.forEach(function(todo){
    console.log(todo.Text)
})

//while
let j=0;
while(j<10){
    console.log(`hi:${j}`);
    j++
}

// JSON
const todojson=JSON.stringify(todos);
console.log(todojson);


// const todotext=todos.map(fuction(todo)){
//     return todo.text;
// }

// console.log(todotext);

const todoText = todos.filter(function(todo){
    return todo.ishuman ===true;

}).map(function(todo){
    return todo.Text;
});

console.log(todoText);


const x1 = 10;
if(x1 === 10){
    console.log('x1 is 10');
}else{
    console.log('x1 is not 10');
}
let p1=6;
let p2=11;
if(p1>5 || p2>10){
    console.log("yes ");
}else{
    console.log("no");
}

//&&

// switch(color)
// {
//     case 'red':
//         console.log('red');
//     case 'greem':
//             console.log('gree');  
//     case 'blue':
//         console.log('blue');
// }

function addNums(num1=1, num2=2){
    return num1+num2;
}

console.log(addNums(4,5));



const addnum = (num1, num2) =>{
return num1+num2;
}

console.log(addnum(6,10));


// function Student(name, roll_no, place, dob){
//     this.name=name;
//     this.roll_no=roll_no;
//     this.class=place;
//     this.dob=new Date(dob);

//     this.getFullname = fuction(){
//         return `${this.name} ${this.place}`
//     }
// }
// const student1=new Student('sachin', 2, 'dan',11-12-1960);
// const student2=new Student('sachi', 7, 'dgg',11-9-1960);

// console.log(student1.name);



class Student{
    constructor(A,B,C){
        this.a=A;
        this.b=B;
        this.c=C;
    }
}

const student3= new Student('sachin', 'chinna', 'dna');

console.log(student3.a);

let iceCream = "mine";
if (iceCream === "mine") {
  alert("Yay, I love chocolate ice cream!");
} else {
  alert("Awwww");
}





// contructor function
/*
function Person(firstName, lastName, dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
}


Person.prototype.getBirthYear = function() {
    this.dob.getFullYear();
}


Person.prototype.getFullName = function() {
    return `${this.firstName} ${this.lastName}`
}

// class
class Person {
    constructor(firstName, lastName, dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob);
    }

    getBirthYear() {
        return this.dob.getFullYear();
    }

    getFullName() {
        return `${this.firstName} ${this.lastName}`
    }
}

// Instantiate Object

const person1 = new Person('nkdebug', 'kr','4-3-1993');
const person2 = new Person('nkdebug1', 'kr1','4-3-1993');


console.log(person1.dob.getFullYear());

console.log(person1.getFullName());

console.log(person1);



*/

/*
DOM manipulation 


// single element
console.log(document.getElementById('my-form'));
console.log(document.querySelector('ul'));









// multiple element
console.log(document.querySelectorAll('.item'));
console.log(document.getElementsByClassName('item'));
console.log(document.getElementsByTagName('li'));

const items = document.querySelectorAll('.item')
items.forEach(item => console.log(item));

const ul = document.querySelector('.items');

// ul.remove();
//ul.lastElementChild.remove();
ul.firstElementChild.textContent = 'nitesh';

ul.children[1].innerText = 'nkdebug';


ul.lastElementChild.innerHTML='<h4>AXIS BANK</h4>'



const btn = document.querySelector('.button');
btn.style.background = 'red';



const btn = document.querySelector('.button');

btn.addEventListener('click', (e) => {
    e.preventDefault();

    document.querySelector('#my-form')
    .style.background = '#ccc'


    document.querySelector('body')
    .classList.add('bg-dark')

    document.querySelector('.items').lastElementChild.innerHTML='<h1>Hello</h1>';

});

*/



const myForm = document.querySelector("#my-form");
const nameInput = document.querySelector("#name");
const emailInput = document.querySelector("#email");
const msg = document.querySelector('.msg');
const userList = document.querySelector('#users');


myForm.addEventListener('submit', onSubmit);


function onSubmit(e) {
    e.preventDefault();

    if(nameInput.value === '' || emailInput.value === '') {
        msg.classList.add('error');
        msg.innerHTML = 'Please enter all fields';

        setTimeout(() => msg.remove(), 3000)

    } else {
        const li = document.createElement('li');
        li.appendChild(document.createTextNode(`${nameInput.value} : ${emailInput.value}`));


        userList.appendChild(li);

        //clear fields
        nameInput.value = '';
        emailInput.value = '';

    }

}


