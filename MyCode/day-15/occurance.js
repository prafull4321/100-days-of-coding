var string="aaahhabbjkjjkkl";
function charOccurance(char)
{
    var count=0;
    for(var i=0;i<string.length;i++)
    {
        if(string[i]==char)
        {
            count++;
        }
    }
    return count;
}
console.log('count of a is:'+charOccurance('a'));
console.log('count of h is:'+charOccurance('h'));
console.log('count of b is:'+charOccurance('b'));
console.log('count of j is:'+charOccurance('j'));
console.log('count of k is:'+charOccurance('k'));
console.log('count of l is:'+charOccurance('l'));