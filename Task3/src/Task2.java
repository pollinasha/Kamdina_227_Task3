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
        for (String animal : animals)
            System.out.println(animal);

        System.out.println("Расписание кормления: ");
        ArrayList<Integer> eat = new ArrayList<Integer>();
        eat.add(1);
        eat.add(4);
        eat.add(0);
        eat.add(2);
        eat.add(3);

        for(int i = 0; i <= 4; i++)
            System.out.println((i+9) + ":00 - " + animals.get(eat.get(i)));

    }
}
