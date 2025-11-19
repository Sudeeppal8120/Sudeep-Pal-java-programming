import java.util.Random;
import java.util.Scanner;
class randomdemo
{
    public static void main (String[]args)
    {
        Random r = new Random();
        int attempts = 10, wins = 0;
        int ch,flag = 0;
        try (Scanner S = new Scanner (System.in)) {
            while (true)
            {
                int rand_num = r.nextInt(1,101);
                System.out.println("Enter Guess: ");
                int guess= S.nextInt();
                while (attempts!=0)
                {
                    if (guess<rand_num)
                    {
                        System.out.println("Too low..");
                    }
                    else if (guess>rand_num)
                    {
                        System.out.println("Too high.. ");
                    }
                    else{
                        System.out.println("Guessed Correctly");
                        wins+=1;
                        flag=1;
                        break;
                    }
                    attempts-=1;
                    if (attempts!=0)
                    {
                        System.out.println("you have "+attempts+"attempts only left");
                        System.out.println("Enter Guess: ");
                        guess=S.nextInt();
                    }
                }
                if (flag==0)
                {
                    System.out.println("The correct number was" +rand_num);
                }
                System.out.println("You won "+wins+" times");
                System.out.println("Do you want to play again (1/0): ");
                ch=S.nextInt();
                if (ch==1)
                {
                    attempts = 10;
                    flag = 0;
                }
                else
                {
                    break ;
                }
            }
        }

        System.out.println("Thanks for playing !");
    }
}