var x=require('readline');
var y=x.createInterface(process.stdin,process.stdout);
var arr=[];
var count=0;
y.question('Enter size of an array',function(size)
{
    console.log(size);
    console.log('Enter sorted array');
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
    console.log('Missing number is:');
    missing();  
    }
});
}

function missing()
{
    var n=arr.length;
    for(var i=0;i<n;i++)
    {
        if(arr[i]!=i)
        {
            break;
        }
    }
    if(i==n-1)
    {
        console.log(++i);
    }
    else
    {
         console.log(i);
    }
}
