public class RightAngleTriangleHollow
{
    public static void main(String S[])
    {
        int n=5,i,j;

        for(i=1;i<=n;i++)
        {
             for(j=1;j<=i;j++)
            {
               if(j == 1 || j == i || i == n) 
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