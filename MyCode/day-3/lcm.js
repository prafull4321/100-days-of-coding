var x=require('readline');
var y=x.createInterface(process.stdin,process.stdout);
var a,b,temp;
y.question('Enter first number to find hcf and lcm\n',function(num1)
{
    y.question('Enter another number',function(num2)
{
    a=num1;
    b=num2;
    while(b!=0)
    {
        temp=b;
        b=a%b;
        a=temp;
    }
    console.log("hcf of" +num1+ "and" +num2+ " is:"+a);
    console.log("lcm of" +num1+ "and" +num2+ " is:"+(num1*num2)/a);
    
    });
});

