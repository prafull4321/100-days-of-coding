var arr=[3,0,1,0,5,9,0,6,7];
console.log('array before pusing zeros at end\n'+arr);
var size=arr.length;
for(var i=0;i<size;i++)
{
    for(var j=0;j<size-1;j++)
    {
        if(arr[j]==0)
        {
            var temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
console.log('array after pushing zeros at end:\n'+arr);
