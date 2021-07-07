import java.util.Scanner;
public class PlayerSelection {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println(menuChoice);
        System.out.println("Add player: A");
        System.out.println("View all players: V");
        System.out.println("Display two best batsmans: B");
        System.out.println("Display two best bowlers: C");
        System.out.println("Display the best keeper: D");
        System.out.println();

        System.out.print("Enter menu choice: ");
        menuChoice = input.next();

        switch (menuChoice) {
            case "A":
                //addmethod call
                break;
            case "V":
                //viewAllPlayers method call
                break;
            case "B":
                //bestBatsmans method call
                break;
            case "C":
                //bestBowlers method call
                break;
            case "D":
                //bestKeepers method call
                break;
            default:
                System.out.println("Invalid entry");
            }
        }
    }
}

