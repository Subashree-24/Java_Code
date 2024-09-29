import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Game{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        List <Integer> num = new ArrayList<>();
        Random ran = new Random();
        
        System.out.println("Welcome To The Game");

        System.out.println("Enter your name player 1");
        String name1 = sc.nextLine();
        System.out.println("Enter your name Player 2");
        String name2 = sc.nextLine();

        Thread.sleep(1000);
        System.out.println("\nHello "+name1+" and "+name2+" Welcome to the game");
        
        System.out.println("\n****Game Instructions ****");
        System.out.println("   1. The Computer stored 5 Random Numbers\n   2. Each player has 3 guesses only \n   3. Player guessing the correct number will get score");
        System.out.println("\nAre You Ready");
        Thread.sleep(1000);

        int a;
        while(num.size()!=5){
            a = ran.nextInt(10)+1;
            if(!num.contains(a))  
                num.add(a); 
        }
        
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();

        int score1=0, score2=0;

        for(int i=1;i<=3;i++)
        {
            System.out.println("----- "+name1+" Turn "+i+", Guess a number -----");
            int g1 = sc.nextInt();
            while(player1.contains(g1) || player2.contains(g1)){
                System.out.println("Sorry the number is already guessed,. Try guessing another number");
                g1 = sc.nextInt();
            }
            player1.add(g1);
            if(num.contains(g1)){
                score1++;
                System.out.println("Guessed Number is correct");
            }

            System.out.println("------ "+name2+" Turn "+i+", Guess a number ------");
            int g2 = sc.nextInt();
            while(player1.contains(g2) || player2.contains(g2)){
                System.out.println("Sorry the number is already guessed,. Try guessing another number");
                g2 = sc.nextInt();
            }
            player2.add(g2);
            if(num.contains(g2)){
                score2++;
                System.out.println("Guessed Number is correct");
            }

        }

        System.out.println("Results");
        Thread.sleep(1000);
        System.out.println("\nThe computer guessed numbers are: "+num);
        System.out.println(name1+" guessed numbers are "+ player1);
        System.out.println(name1+" score is: "+score1);
        System.out.println(name2+" guessed numbers are "+ player2);
        System.out.println(name2+" score is: "+score2);

        Thread.sleep(1000);
        if(score1>score2)
            System.out.println(ANSI_RED + "\nPlayer 1: "+name1+" WON!! Congratulations!!"+ ANSI_RESET);
        else if(score1<score2)
            System.out.println(ANSI_RED+"\nPlayer 2: "+name2+" Won.. Congratulations!!"+ANSI_RESET);
        else
            System.out.println(ANSI_RED+"GAME DRAW"+ANSI_RESET);
    }
}