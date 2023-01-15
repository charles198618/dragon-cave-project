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
    }
}
