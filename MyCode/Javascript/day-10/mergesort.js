var left=[1,3,4];
var right=[2,9,7];
var i=0;
var j=0;
var results=[];
while(i<left.length || j<right.length)
{
    if(i===left.length)
    {
        results.push(right[j]);
        j++;
    }
    else if(j===right.length || left[i]<=right[j])
    {
        results.push(left[i]);
        i++;
    }
    else
    {
         results.push(right[j]);
         j++;
    }
}
console.log(results);