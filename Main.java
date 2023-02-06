import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);   //Scanner class
        int randomNumber=(int)(Math.random()*2)+1;   //Random number 1 or 2
        System.out.println("You are in a land full of dragons. In front of you,\r\n" +
                "\r\n" +
                "you see two caves. In one cave, the dragon is friendly\r\n" +
                "\r\n" +
                "and will share his treasure with you. The other dragon\r\n" +
                "\r\n" +
                "is greedy and hungry and will eat you on sight.\r\n" +
                "\r\n" +
                "Which cave will you go into? (1 or 2)");

        int UserInput=sc.nextInt();
        //int ch=sc.nextInt();   //user enters the choice of cave
        if(UserInput==randomNumber) {   //if user's choice matches with the random value

            System.out.println("You approach the cave...\r\n" +
                    "\r\n" +
                    "It is dark and spooky...\r\n" +
                    "\r\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\r\n" +
                    "\r\n" +
                    "Gobbles you down in one bite!");
        }
        else if(UserInput>2){   //if the user enters an invalid choice
            System.out.println("Wrong choice");
        }
        else {    //if the user's choice doesn't match with the random number
            System.out.println("You approached the cave\n\nA friendly dragon appears...\n\nHe shares his treasure with you\n\nCongratulations you got your treasure!");
        }
    }
}
