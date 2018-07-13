var x=require('readline');
var y=x.createInterface(process.stdin,process.stdout);
var arr=[];
var count=0;

y.question('Enter size of an array',function(size)
{
    console.log(size);
    console.log('Enter an array ');
    readarray(size);
});
function readarray(size)
{
    y.question('',function(store)
{
     store=parseInt(store);
     arr.push(store);
     if(count<size-1)
     {
         count++;
         readarray(size);
     }
     else
     {
         console.log(arr);
         console.log('Here is sorting  of bubble algorithm:');
         sorting();
     } 
});
}
function sorting()
{
    var swap;
    var temp;
    var n=arr.length-1;
    var x=arr;
    do
    {
    swap=false;
    for(var i=0;i<n;i++)
    {
         if(x[i]>x[i+1])
         {
             temp=x[i];
             x[i]=x[i+1];
             x[i+1]=temp;
             swap=true;
         }  
     }
        n--;
    }   while(swap);
      console.log(x);
}