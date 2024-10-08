public class App
{
    public static void main(String[] args) 
    {
        //PART 1
        for (int i = 1; i <= 5; i++)
        {
            for (int x = 1; x<= i; x++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        //PART 2
        for (int i = 1; i <= 5; i++)
        {
            for (int x = 4; x>= i; x--)
            {
                System.out.print(".");
            }
            for (int a = 1; a <= i; a++)
            {   
                System.out.print(i);
            }
            System.out.println();   
        }

        System.out.println();
        
        //PART 3
        for (int i = 1; i < 6; i++)
        {
            for (int x = 4; x>= i; x--)
            {
                System.out.print(".");
            }
            
            System.out.print(i);

            for (int c = 1; c< i; c++)
            {
                System.out.print(".");
            }

            System.out.println();
        }

        /*for (int i = 1; i <= 5; i++)
        {
            for (int c = 1; c <= 4; c++)
            {
                System.out.print(i);
            }
            System.out.println();
        }*/
    }
}
