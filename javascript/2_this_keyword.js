/**
 * Rule 1 — Default binding
    When you call a function normally, this is the global object (window in browser, global in Node). 
    In strict mode, it's undefined.
 */

function greet() {
    console.log(this);
}

greet();

console.log("-------------------------------------------------*******-------------------------------------------------")

/**
 * Rule 2 — Implicit binding
    When a function is called as a method on an object, this is that object.
 * 
 */

const user = {
    name: 'Amit',
    greet(){
        console.log(this)
    }
}
user.greet();

console.log("-------------------------------------------------*******-------------------------------------------------")

/**
 * Rule 3 — Explicit binding (call, apply, bind)
    You manually tell JS what this should be.
 */

function greet2(greeting){
    console.log(greeting + ', ' + this.name)
}

const user2 = {name: 'Amit'}

greet2.call(user2, 'Hello');    // "Amit" — call invokes immediately
greet2.apply(user2, ['Hello']);   // "Amit" — apply also invokes immediately
                     // difference: apply takes args as array

const boundGreet = greet2.bind(user2); // bind returns a NEW function
boundGreet('Hello'); // "Amit"


console.log("-------------------------------------------------*******-------------------------------------------------")

const user3 = {
    name: 'Amit Singh',
    greet: function() {

        return () => console.log(this.name);
    }
}

user3.greet()