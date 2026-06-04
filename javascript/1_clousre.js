function makeCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    }
}

const counter = makeCounter();
const counter2 = makeCounter();

console.log(counter()); // 1
console.log(counter()); // 2
console.log(counter()); // 3

console.log(counter2());//1
console.log(counter2());//2


//------------------------------------------------------------------------------------------------------------------------
/**
 * Data Privacy
 */
console.log("--------------------------")


function createBankAccount(initialBalance) {
    let balance = initialBalance; //nobody outside can touch this directly

    return {
        deposite(amount) {
            balance += amount;
        },
        withdraw(amount) {
            if (amount > balance) {
                console.log("Insufficient Funds")
                return;
            }
            balance -= amount;
        },
        getBalance() {
            return balance;
        }
    }
}

const account = createBankAccount(100);

account.deposite(50);
account.withdraw(200);

console.log(account.getBalance())
console.log(account.balance);

//------------------------------------------------------------------------------------------------------------------------

function multiplier(factor) {
    return function (number) {
        return number * factor;
    }
}

const double = multiplier(2);
const triple = multiplier(3);
console.log("--------------------------")
console.log(double(10));
console.log(triple(10));
console.log(triple(10));

//------------------------------------------------------------------------------------------------------------------------
console.log("--------------------------")
function outer() {
    let x = 10;

    function inner() {
        console.log(x);
    }

    x = 20;
    inner();
}
outer();

//------------------------------------------------------------------------------------------------------------------------
console.log("--------------------------")

for (var i = 0; i < 3; i++) {
    setTimeout(function () {
        console.log(i)
    }, 1000)

}

//------------------------------------------------------------------------------------------------------------------------
console.log("--------------------------")

function makeAdder(x) {
    return function (y) {
        return x + y;
    }
}

const add5 = makeAdder(5);
const add10 = makeAdder(10);
const add05 = makeAdder(5);

console.log(add5(3));
console.log(add10(3))
console.log(add05 === add5)

//------------------------------------------------------------------------------------------------------------------------
console.log("--------------------------")


//------------------------------------------------------------------------------------------------------------------------
/**
 * makeCounter() ran and finished. Normally count would be garbage collected. 
 * But because the returned function references count, JS keeps that environment alive. The inner function "closes over" it.
 * 
 * Real use case — Data privacy
 *  JS has no private keyword in plain objects. Closures are how you fake it.
 * 
 * 
 * 
 * 
 * Q1 — Basic: "What is a closure?"
        Good answer: "A closure is when a function retains access to its outer function's scope even after the outer function has returned. 
        The inner function holds a reference to the variables in that scope, keeping them alive in memory."

    Q2 — Follow-up: "What's the difference between closure and scope?"
            Good answer: "Scope is the rule that determines where a variable is accessible. 
            Closure is the mechanism that preserves that scope even after the function that created it has finished executing."
 */
