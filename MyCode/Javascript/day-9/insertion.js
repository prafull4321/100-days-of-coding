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
         console.log('Here is sorting  of insertion algorithm:');
         sorting();
     } 
});
}
function sorting()
{
    var n=arr.length;
    var j;
    for(var i=1;i<n;i++)
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
    console.log(arr);
}