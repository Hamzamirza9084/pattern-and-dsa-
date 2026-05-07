public class RightHalfDiamondMirror
{
    public static void main(String S[])
    {
        int n=4,i,j,k;

        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
             for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
       
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
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
       
    }
}