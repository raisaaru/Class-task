package paperrockscissorsspocklizard;

import paperrockscissors.PaperRockScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, make your choice: paper, rock, scissors, spock or lizard!");
        String player1 = scanner.nextLine();

        System.out.println("Player 2, make your choice: paper, rock, scissors, spock or lizard!");
        String player2 = scanner.nextLine();

        WithSpockLizard withSpockLizard = new WithSpockLizard();
        System.out.println(withSpockLizard.paperRockWithSpockLizard(player1, player2));



    }
}
