public class RightAngleTriangleHollowMirror
{
    public static void main(String S[])
    {
        int n=5,i,j,k;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                if(k==1 || k==i || i==n )
                {
                    System.out.print("* ");
                }
                else
                 {
                    System.out.print("  ");
                 }
            }
            System.out.println();
        }
    }
}