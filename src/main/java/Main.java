import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести данные для списка");
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        System.out.print("Вот исходный список: ");
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int e = random.nextInt(m);
            source.add(e);
            System.out.print(e + " ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}