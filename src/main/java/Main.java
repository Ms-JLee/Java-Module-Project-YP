import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать на величайшую гонку  \"24 часа Ле-Мана\". Победит самый быстрый! \nВведите названия и скорости трех участников гонки. Скорость должна быть от 0 до 250 км/ч");
        Race race = new Race();
        for (int i = 1; i <= 3; i++) {
            System.out.println("— Введите название машины №" + i);
            // Метод next() возвращает введённую строку

            String name = scanner.next();

            while (true) {
                System.out.println("— Введите скорость машины №" + i);
                // Метод nextInt() возвращает введённое целое число.
                int speed = scanner.nextInt();
                if (speed >= 251) {
                    System.out.println("— Неправильная скорость");
                } else if (speed <= 0) {
                    System.out.println("— Неправильная скорость");
                } else {
                    System.out.println("Автомобиль добавлен: " + name + " со скоростью " + speed + " км/ч");
                    Car car = new Car(name, speed);
                    race.whoIsLeader(car.name, car.speed);
                    break;
                }

            }

        }
        race.whoIsChampion();
    }
}
