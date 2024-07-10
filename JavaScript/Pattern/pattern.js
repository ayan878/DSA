console.log("Square Pattern")

function squareStars(n) {
    // Loop through rows
    for (let i = 0; i < n; i++) {
        let row = '';
        // Loop through columns
        for (let j = 0; j < n; j++) {
            row += '* ';
        }
        console.log(row); // Print each row
    }
}

// Example usage:
squareStars(5);


console.log("Right Angle Triangle Pattern")
function rightAngleStars(n) {
    // Loop through rows
    for (let i = 0; i < n; i++) {
        let row = '';
        // Loop through columns
        for (let j = 0; j < i; j++) {
            row += '* ';
        }
        console.log(row); // Print each row
    }
}

// Example usage:
rightAngleStars(5);

console.log("Right Angle Number Pattern");
function rightAngleNumbers(n) {
    // Loop through rows
    for (let i = 1; i <= n; i++) {
        let row = '';
        // Loop through columns
        for (let j = 1; j <= i; j++) {
            row += j + ' ';
        }
        console.log(row); // Print each row
    }
}

rightAngleNumbers(5);


console.log("Right Angle Number PatternII");
function rightAngleNumbersII(n) {
    // Loop through rows
    for (let i = 1; i <= n; i++) {
        let row = '';
        // Loop through columns
        for (let j = 1; j <= i; j++) {
            row += i + ' ';
        }
        console.log(row); // Print each row
    }
}

rightAngleNumbersII(5);


console.log("Inverted Right Angle Star Pattern");
function invertedRightAngleStars(n) {
    // Loop through rows
    for (let i = n; i > 0; i--) {
        let row = '';
        // Loop through columns
        for (let j = 1; j <= i; j++) {
            row += "*" + ' ';
        }
        console.log(row); // Print each row
    }
}

invertedRightAngleStars(5);


console.log("Inverted Right Angle Number Pattern");
function invertedRightAngleNumbers(n) {
    // Loop through rows
    for (let i = n; i > 0; i--) {
        let row = '';
        // Loop through columns
        for (let j = 1; j <= i; j++) {
            row += j + ' ';
        }
        console.log(row); // Print each row
    }
}

invertedRightAngleNumbers(5)


console.log("Star Pyramid Pattern");
function starPyramid(n) {
    for (let i = 0; i < n; i++) {
        let row = '';

        // Loop for spaces before stars
        for (let j = 0; j < n - i - 1; j++) {
            row += '-';
        }

        // Loop for printing stars
        for (let j = 0; j < 2 * i + 1; j++) {
            row += '*';
        }

        console.log(row);
    }
}

starPyramid(5);

console.log('Inverted Star Pyramid');

function invertedStarPyramid(n){
    for(let i=n;i>0;i--){
    let row='';
    // Loop for spaces before stars
        for (let j = 0; j < n - i ; j++) {
            row += '-';
        }
        for(let j=2*i-1;j>0;j--){
            row+="*";
        }

        console.log(row);
    }
}
invertedStarPyramid(5)


console.log('Diamond star Pattern')
function diamondStar(n){

    starPyramid(5);
    invertedStarPyramid(5);
}
diamondStar(5)
