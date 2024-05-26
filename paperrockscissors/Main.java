package paperrockscissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, make your choice: paper, rock or scissors!");
        String player1 = scanner.nextLine();

        System.out.println("Player 2, make your choice: paper, rock or scissors!");
        String player2 = scanner.nextLine();

        PaperRockScissors paperRockScissors = new PaperRockScissors();
        System.out.println(paperRockScissors.paperRockScissors(player1, player2));



    }
}
