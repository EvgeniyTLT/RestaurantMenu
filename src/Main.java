import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Finish.printMenu();
        Scanner scanner = new Scanner(System.in);
        int personInput = scanner.nextInt();
        while (personInput != 8) {
            if (personInput < 1 || personInput > 8) {
                System.out.println("некоректный ввод");
                System.out.println("");
            } else if (personInput == 1) {
                ShowAll showDrinks = new ShowAll(new File("drinksMenu.txt"));
                showDrinks.choice();
            } else if (personInput == 2) {
                ShowAll showFirst = new ShowAll(new File("first.txt"));
                showFirst.choice();
            } else if (personInput == 3) {
                ShowAll showSecond = new ShowAll(new File("second.txt"));
                showSecond.choice();
            } else if (personInput == 4) {
                ShowAll showSalads = new ShowAll(new File("salads.txt"));
                showSalads.choice();
            } else if (personInput == 5) {
                Finish.showFinish();
            } else if (personInput == 6) {
                Finish.correction();
            } else if (personInput == 7) {
                System.out.println("fsdjks");
                Finish.checkout();
            }
            Finish.printMenu();
            personInput = scanner.nextInt();
        }

    }


}
