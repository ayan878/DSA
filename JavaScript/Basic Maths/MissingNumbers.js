function findMissingNumbers(arr) {
    const n = arr.length + 1;
    const fullSet = new Set(arr);
    const missingNumbers = [];

    for (let num = 1; num <= n; num++) {
        if (!fullSet.has(num)) {
            missingNumbers.push(num);
        }
    }

    return missingNumbers;
}

// Example usage:
console.log(findMissingNumbers([1, 3, 5, 7, 4])); // Output: [2, 6]
