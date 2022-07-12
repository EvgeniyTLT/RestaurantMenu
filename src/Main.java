import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Finish.printMenu();
        Scanner scanner = new Scanner(System.in);
        int personInput = scanner.nextInt();
        ShowDrinks showDrinks = new ShowDrinks();
        ShowFirst showFirst = new ShowFirst();
        ShowSecond showSecond = new ShowSecond();
        ShowSalads showSalads = new ShowSalads();
        while (personInput != 8) {
            if (personInput < 1 || personInput > 8) {
                System.out.println("некоректный ввод");
                System.out.println("");
            } else if (personInput == 1) {
                showDrinks.choice();
            } else if (personInput == 2) {
                showFirst.choice();
            } else if (personInput == 3) {
                showSecond.choice();
            } else if (personInput == 4) {
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
