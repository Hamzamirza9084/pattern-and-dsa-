public class HollowDiamondSideFill
{
    public static void main(String S[])
    {
        int n=5,i,j,k;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n- i + 1);j++)
            {
                System.out.print("* ");
            }
            for(k=1;k<=(2 * i - 2);k++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=(n - i + 1);k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=n-1;i>=1;i--)
        {
             for(j=1;j<=(n- i + 1);j++)
            {
                System.out.print("* ");
            }
            for(k=1;k<=(2 * i - 2);k++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=(n - i + 1);k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }     
    }
}