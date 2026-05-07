public class RightHalfDiamond
{
    public static void main(String S[])
    {
        int n=4,i,j,k;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
           
            System.out.println();
        }
       
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}