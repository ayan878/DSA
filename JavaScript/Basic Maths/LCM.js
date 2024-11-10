function GCD(a,b){
    if(b===0){
        return a;
    }
    return GCD(b,a%b);
}
function LCM(a,b){
    return (a*b)/GCD(b,a%b);
}

console.log(LCM(12,8));