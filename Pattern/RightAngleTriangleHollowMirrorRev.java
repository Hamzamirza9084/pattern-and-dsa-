public class RightAngleTriangleHollowMirrorRev
{
    public static void main(String s[])
    {
        int n=5,i,j,k;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    if(i==1 || j==i || j==n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}