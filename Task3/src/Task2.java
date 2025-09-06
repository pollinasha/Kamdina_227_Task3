// "Сегодня в зоопарке можно увидеть кормления " + ... + " животных."
// "Это будут:"
// "Шиншилла"
// "Крокодил"
// "Лев"
// "Медведь"
// "Слон"
// "Расписание кормлений:"
// "В 9:00 - "
// "В 10:00 - "
// "В 11:00 - "
// "В 12:00 - "
// "В 13:00 - "


import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("hinchilla");
        animals.add("crocodile");
        animals.add("lion");
        animals.add("bear");
        animals.add("elephant");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal : animals)
            System.out.println(animal);

        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - "+animals.get(1));
        System.out.println("В 10:00 - "+animals.get(4));
        System.out.println("В 11:00 - "+animals.get(0));
        System.out.println("В 12:00 - "+animals.get(2));
        System.out.println("В 13:00 - "+animals.get(3));

    }
}
