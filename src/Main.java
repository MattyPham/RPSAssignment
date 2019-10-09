import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock paper scissors!");
        System.out.println("You play your move first.");
        String name = scan.nextLine();
//Rock = 1 Scissors = 2 Paper = 3
        if(name.equalsIgnoreCase("Rock")) {
            int computerChoice = (int)(Math.random()*3) + 1;
            if(computerChoice == 1) {
                System.out.println("I play rock!");

                System.out.println("It's a tie");
            }
            else if (computerChoice == 2) {
                System.out.println("I choose scissors!");
                System.out.println("Aw, looks like you won.");
            }
            else if (computerChoice == 3) {
                System.out.println("I choose paper!");

                System.out.println("Ha, I am victorious this time around.");
            }
        }

        if(name.equalsIgnoreCase("Scissors")) {
            int computerChoice = (int)(Math.random()*3) + 1;
            if(computerChoice == 1) {
                System.out.println("I choose rock!");

                System.out.println("I crush your scissors thus, I have won.");
            }
            else if (computerChoice == 2) {
                System.out.println("I choose scissors!");
                System.out.println("Scissors can't cut through their own kind, this is a tie.");
            }
            else if (computerChoice == 3) {
                System.out.println("I choose paper!");

                System.out.println("You have cut me down into shreds of paper, this is my loss..");
            }
        }

        if(name.equalsIgnoreCase("Paper")) {
            int computerChoice = (int)(Math.random()*3) + 1;
            if(computerChoice == 1) {
                System.out.println("I choose rock!");

                System.out.println("Looks like I've been mauled by your paper, this is your win.");
            }
            else if (computerChoice == 2) {
                System.out.println("I choose scissors!");
                System.out.println("My scissors ripped through your paper, this is my win.");
            }
            else if (computerChoice == 3) {
                System.out.println("I choose paper!");

                System.out.println("Well paper against paper is useless, its a tie!");
            }
        }
        //Rock > Scissors > Paper > Rock


    }
    }

