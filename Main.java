import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our app!");
        Scanner sc=new Scanner(System.in);   //scanner class
        int r=(int)(Math.random()*2)+1;   //random of 1 or 2
        System.out.println("You are in a land full of dragons. In front of you,\r\n" +
                "\r\n" +
                "you see two caves. In one cave, the dragon is friendly\r\n" +
                "\r\n" +
                "and will share his treasure with you. The other dragon\r\n" +
                "\r\n" +
                "is greedy and hungry and will eat you on sight.\r\n" +
                "\r\n" +
                "Which cave will you go into? (1 or 2)");
        int ch=sc.nextInt();
    }
}
