import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);
        int menu = 1;

        while (menu != 0) {
            System.out.println("\n\tМеню зоопарка");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное в список");
            System.out.println("3. Удалить животное из списка");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("6. Расписание кормлений");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    getAllAnimals(animals);
                    break;
                case 2:
                    addAnimal(animals, scanner);
                    break;
                case 3:
                    removeAnimal(animals, scanner);
                    break;
                case 4:
                    removeAllAnimal(animals);
                    break;
                case 5:
                    searchAnimal(animals, scanner);
                    break;
                case 6:
                    getEat(animals);
                    break;
                case 0:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
        scanner.close();
    }

    public static void getAllAnimals(ArrayList<String> animals) {
        System.out.println("\t" + "Сегодня в зоопарке можно увидеть " + animals.size() + " животных." + "\n" + "\t" + "Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    public static void addAnimal(ArrayList<String> animals, Scanner scanner) {
        System.out.print("Введите название животного: ");
        String newAnimal = scanner.nextLine();
        animals.add(newAnimal);
        System.out.println("\t" + "Животное " + newAnimal + " добавлено");
    }

    public static void removeAnimal(ArrayList<String> animals, Scanner scanner) {
        if (animals.isEmpty()) {
            System.out.println("Список животных пуст");
            return;
        }

        System.out.print("Введите название животного для удаления: ");
        String animalToRemove = scanner.nextLine();

        if (animals.remove(animalToRemove)) {
            System.out.println("\t" + "Животное " + animalToRemove + " удалено");
        } else {
            System.out.println("\t" + "Животное " + animalToRemove + "не найдено");
        }
    }

    public static void removeAllAnimal(ArrayList<String> animals) {
        if (animals.isEmpty()) {
            System.out.println("Список уже пуст");
        } else {
            animals.clear();
            System.out.println("Список очищен");
        }
    }

    public static void searchAnimal(ArrayList<String> animals, Scanner scanner) {
        System.out.print("Введите название животного для поиска: ");
        String animalToSearch = scanner.nextLine();

        if (animals.contains(animalToSearch)) {
            System.out.println("\t" + "Животное " + animalToSearch + " есть в зоопарке");
        } else {
            System.out.println("\t" + "Животное " + animalToSearch + " отсутствует в зоопарке.");
        }
    }

    public static void getEat(ArrayList<String> animals) {
        System.out.println("\t" + "Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
    }
}