let memo=new Map();
function fib(n,memo){
    if(n===1 || n===0)return n;

    if(memo.has(n))return memo.get(n);

    let result= fib(n-1,memo)+fib(n-2,memo);
    memo.set(n,result);
    return result;
}
console.log(fib(6,memo))