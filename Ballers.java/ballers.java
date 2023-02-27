import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasketballRosterManager {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Welcome to Basketball Roster Management!");
        System.out.println("====================================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        List<BasketballPlayer> roster = new ArrayList<>();

        do {
            System.out.println("====================================");
            System.out.println("1. Show all Players");
            System.out.println("2. Add a Player");
            System.out.println("3. EXIT");
            System.out.println("====================================");

            System.out.println(" Please choose an option : ");

            option = sc.next();

            System.out.println(); // Move the control to next line!

            System.out.println(option + "OPTION");
            switch (option) {
                case "1":
                    System.out.println("You chose to show all players!");
                    showAllPlayerDetails(roster);
                    break;
                case "2":
                    System.out.println("You chose to add a player!");
                    System.out.println("====================================");

                    System.out.println("====================================");
                    BasketballPlayer newPlayer = new BasketballPlayer();
                    newPlayer = enterPlayerDetails();

                    roster.add(newPlayer);

                    break;
                case "3":
                    System.out.println("GOOD BYE!");
                    sc.close();
                    break;
                default:
                    System.out.println("I am confused!");
                    break;

            }


        } while (!option.equals("3"));

        System.out.println("Thank you for using our platform!");
    }

    public static BasketballPlayer enterPlayerDetails() {
        Scanner sc2 = new Scanner(System.in);
        String name = "";
        int age = 0;
        int jerseyNumber = 0;
        String position = "";

        System.out.println("Enter Player Name: ");
        name = sc2.nextLine();

        System.out.println("Enter Player Age: ");
        age = sc2.nextInt();

        System.out.println("Enter Player Jersey Number: ");
        jerseyNumber = sc2.nextInt();

        System.out.println("Enter Player Position: ");
        position = sc2.next();

        BasketballPlayer newPlayer = new BasketballPlayer(name, age, jerseyNumber, position);

        return newPlayer;

    }

    public static void showAllPlayerDetails(List<BasketballPlayer> roster) {
        for (BasketballPlayer player : roster) {
            System.out.println("***************************");
            player.getPlayerInfo();
            System.out.println("***************************");
        }
    }

    public static class BasketballPlayer {
        private String name;
        private int age;
        private int jerseyNumber;
        private String position;

        public BasketballPlayer(String name, int age, int jerseyNumber, String position) {
            this.name = name;
            this.age = age;
            this.jerseyNumber = jerseyNumber;
            this.position = position;
        }

        public void getPlayerInfo() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Jersey Number: " + this.jerseyNumber);
            System.out.println("Position: " + this.position);
        }
    }
}
