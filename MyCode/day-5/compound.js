var x=require('readline');
var y=x.createInterface(process.stdin,process.stdout);
y.question('Enter the principle amount\n',function(pr)
{
    y.question('Enter rate of interest\n',function(rate)
{
    y.question('Enter no. of years\n',function(t)
{
    var comp=pr*Math.pow((1.0+rate/100),t);
    console.log('Compound Interest:'+comp);
});
});
});