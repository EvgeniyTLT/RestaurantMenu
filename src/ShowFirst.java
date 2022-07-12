import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowFirst {
    private File file;
    private List<String> menu = new ArrayList<>();
    private List<String> personMenu = new ArrayList<>();
    private Scanner scanner;

    public ShowFirst() {
        this.file = new File("first.txt");
        try {
            this.scanner = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addMenu() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            menu.add(line);
        }
        menu.remove(0);

    }

    public void showMenu() {
        System.out.println("Сделайте свой выбор");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " : " + menu.get(i));
        }
        System.out.println("для выхода в основное меню нажмите: " + menu.size());
    }

    public void choice() {
        addMenu();
        showMenu();
        scanner = new Scanner(System.in);
        int personInput = scanner.nextInt();
        if (personInput == menu.size()) return;
        while (personInput != menu.size()) {
            if (personInput < 0 || personInput > menu.size()) {
                System.out.println("некоректный ввод");
                System.out.println("");
            }
            Finish.getFinish().add(menu.get(personInput));
            personMenu.add(menu.get(personInput));
            showMenu();
            personInput = scanner.nextInt();
        }
        System.out.println("ваш выбор:");
        for (String x : personMenu
        ) {
            System.out.println(x);
        }
        System.out.println("");

    }

    public List<String> getPersonMenu() {
        return personMenu;
    }

    @Override
    public String toString() {
        return "ShowDrinks{" +
                "file=" + file +
                ", menu=" + menu +
                ", personMenu=" + personMenu +
                ", scanner=" + scanner +
                '}';
    }
}
