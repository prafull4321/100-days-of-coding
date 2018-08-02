var x=require('readline');
var y=x.createInterface(process.stdin,process.stdout);
var sum;
y.question('Enter a number',function(a)
{
    y.question('Enter another number',function(b)
{
    var x1=parseInt(a);
    var y1=parseInt(b);
sum=x1+y1;
console.log('Sum of '+a+' and '+b+' is '+sum);
});
});