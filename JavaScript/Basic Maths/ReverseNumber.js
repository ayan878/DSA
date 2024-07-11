 // function reverseNumber(){
 //    const a=prompt(number('enter 1st number'));
 //     const b=prompt(number('enter 1st number'));
 //     const c=prompt(number('enter 1st number'));
 //     const res=(a+b+c)
 //     console.log(res)
 //     // const arr=[];
 //     // const newarr= arr.push[a,b,c]
 // }
 // reverseNumber();

 function reverseNumber(n){
    let rem=0;
    let rev=0;
    while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=Math.floor(n/10);
    }
    return rev;
 }
 console.log(reverseNumber(123));
