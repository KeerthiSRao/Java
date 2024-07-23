class DiamondRunner
{
    public static void main(String[] args) {
        int num = 5; 

        for (int i=0;i<num;i++)
			{
            for (int j=i;j<num;j++) 
			{
                System.out.print(" ");
            }
            for (int j=0;j<(2*i-1);j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=num-1;i>=0;i--)
			{
            for (int j=num;j>i;j--)
			{
                System.out.print(" ");
            }
            for (int j=0;j<=(2*i-1);j++)
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
