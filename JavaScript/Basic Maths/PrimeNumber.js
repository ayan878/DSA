function isPrime(n){

    for (let i = 2; i < n; i++) {
        if(n%i===0){
            return false;
        }
    }
    return  true;
}

console.log(isPrime(17));

function isPrimeNumber(n) {
    // Handle cases for small numbers directly
    if (n <= 1) {
        return false;
    }
    if (n <= 3) {
        return true;
    }

    // Check for divisibility of numbers up to square root of n
    if (n % 2 === 0 || n % 3 === 0) {
        return false;
    }
    // Optimized loop for checking prime numbers
    for (let i = 5; i * i <= n; i += 6) {
        if (n % i === 0 || n % (i + 2) === 0) {
            return false;
        }
    }

    return true;
}

console.log(isPrimeNumber(1033)); // Output: true (29,1033 is a prime number)
console.log(isPrimeNumber(30)); // Output: false (30 is not a prime number)
