class number_3{
    public static void main(String args[])
    {
     
        int one = 1;
        int zero = 0;
        for(int i = 1 ; i <= 5; i++)
        {
            for(int j = 1 ;j <=i ;j++)
            {
                if((i+j)% 2 == 0)
                {
                    System.out.print(" "+one+" ");
                }
                else{
                    System.out.print(" "+zero+" ");
                }
            }
            System.out.println();
        }
    }
}