import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Finish {
    private static List<String> finish = new ArrayList<>();

    public static List<String> getFinish() {
        return finish;
    }

    public static void printMenu() {
        System.out.println("""
                выберите один из пунктов меню\s
                1) показать меню напитков
                2) показать меню первых блюд
                3) показать меню вторых блюд\s
                4) показать меню салатов
                5) показать заказ 
                6) корректировка заказа
                7) оформить заказ
                8) покинуть ресторан""");
        System.out.println("");

    }


    public static void showFinish() {
        System.out.println("Ваш заказ:");
        for (int i = 0; i < finish.size(); i++) {
            System.out.println(i + " : " + finish.get(i));
        }
        System.out.println(" ");
    }


    public static void correction() {
        try {
            showFinish();
            Scanner scanner = new Scanner(System.in);
            System.out.println("для выхода в основное меню нажмите: " + finish.size());
            scanner = new Scanner(System.in);
            int personInput = scanner.nextInt();
            if (personInput == finish.size()) return;
            while (personInput != finish.size()) {
                if (personInput < 0 || personInput > finish.size()) {
                    System.out.println("некоректный ввод");
                    System.out.println("");
                }
                finish.remove(personInput);
                showFinish();
                personInput = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("заказ не оформлен");
        }

    }

    public static void checkout() {
        int sum = 0;

        try {
            File file = new File("yourOrder.txt");
            PrintWriter pw = new PrintWriter("yourOrder.txt");
            for (String f : finish
            ) {
                pw.println(f);

            }
            pw.close();
            Scanner scanner = new Scanner("yourOrder.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(",");
                sum += Integer.parseInt(numbers[2]);
            }

            System.out.println("В оплате: " + sum + " рублей");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
