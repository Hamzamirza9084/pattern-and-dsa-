public class Pyramid3StarRev
{
    public static void main(String S[])
    {
        int n=5,i,j,k;

        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=(2 * i - 1);k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}