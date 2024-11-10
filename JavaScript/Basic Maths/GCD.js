function GCD(a,b){
    if(b===0){
        return a;
    }
    return GCD(b,a%b);
}
console.log(GCD(12,8));