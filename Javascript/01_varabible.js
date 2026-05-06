const c='A'

var cc=c.charCodeAt(0);

for(i=5;i>=1;i--)
{   
    for(j=5-1;j>=i;j--)
    {
        process.stdout.write(" ")
    }
    for(k=1;k<=i;k++)
    {
        process.stdout.write(cc)
    }
    console.log("");
}


