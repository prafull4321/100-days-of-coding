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
  var temp;
  for(var i=0;i<n-1;i++)
  {
       var min=i;
       for(var j=i+1;j<n;j++)
       {
           if(arr[j]<arr[min])
           {
              min=j;
           }
              temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
       }      
  }   
  console.log(arr);
}