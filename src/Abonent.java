import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Abonent {

    private final String name;
    private final String number;


    private static final HashMap<String, String> abonents = new HashMap<>();

    public Abonent(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static void fillBook() {
        while (abonents.size() < 20) {
            abonents.put(DataForAbonent.getFullName(), DataForAbonent.getNumber());
        }
    }

    public static void viewPhoneBook() {
        System.out.println("Список абонентов в телефонной книге:");
        for (Map.Entry<String, String> abonent : abonents.entrySet()) {
            System.out.println(abonent.getKey() + " - номер: " + abonent.getValue());
        }
    }


    public static class DataForAbonent {

        static ArrayList<String> firstNames = new ArrayList<>(Arrays.asList(
                "Андрей", "Иван", "Денис", "Виктор", "Леонид", "Роман", "Марк", "Кирилл", "Олег", "Георгий"));

        static ArrayList<String> secondNames = new ArrayList<>(Arrays.asList(
                "Георгадзе", "Заяц", "Волк", "Василевский", "Котовский", "Звездный", "Цой", "Лещенко", "Ульянов", "Бесфамильный"));

        static ArrayList<String> numbers = new ArrayList<>(Arrays.asList(
                "+7999-111-11-11", "+7838-222-22-22", "+7101-333-33-33"));

        public static String getFullName() {
            String fullName = "";
            int index = (int) (Math.random() * firstNames.size());
            fullName += firstNames.get(index);
            index = (int) (Math.random() * secondNames.size());
            fullName = fullName + " " + secondNames.get(index);
            return fullName;
        }

        public static String getNumber() {
            int index = (int) (Math.random() * numbers.size());
            return numbers.get(index);
        }
    }
}
