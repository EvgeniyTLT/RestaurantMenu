import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Save {
    private File file;
    private Scanner scanner;

    public Save(File file) {
        this.file = file;
        try {
            this.scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveTheCheck() {
        Finish.checkout();
        int sum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(", ");
            sum += Integer.parseInt(numbers[2]);
        }
        System.out.println("C вас " + sum + " рублей");
        System.out.println("Весь ваш заказ указан в файле yourOrder.txt");
    }
}
