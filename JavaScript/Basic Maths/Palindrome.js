class Palindrome {
     isPalindrome(n) {
        let original = n;
        let rev = 0;
        let rem = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = Math.floor(n / 10);
        }

        return rev === original;
    }
}

const palindrome = new Palindrome();
console.log(palindrome.isPalindrome(121)); // Output: true
console.log(palindrome.isPalindrome(123)); // Output: false
