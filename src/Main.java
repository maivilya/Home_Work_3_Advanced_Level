import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        words();
        phoneBook();
    }

    private static void words() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] Words = {
                "Игрушка", "Компьютер", "Собака",
                "Помидор", "Сыр", "Кот",
                "Собака", "Кот", "Джава",
                "Джава", "Друг", "Комьютер",
                "Игрушка", "Собака", "Охотник",
                "Кот", "Джава", "Игрушка", "Кот"
        };
        for (int i = 0; i < Words.length; i++) {
            if (hashMap.containsKey(Words[i])) {
                hashMap.put(Words[i], hashMap.get(Words[i]) + 1);
            } else hashMap.put(Words[i], 1);
        }
        System.out.println(hashMap);
    }

    private static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Мамаев", "000000000");
        phoneBook.add("Сайфуллин", "111111111");
        phoneBook.add("Лаптев", "222222222");
        phoneBook.add("Мартынова", "333333333");
        phoneBook.add("Мартынова", "444444444");
        phoneBook.add("Мамаев", "555555555");
        phoneBook.add("Зведенинов", "666666666");

        System.out.println(phoneBook.get("Мамаев"));
        System.out.println(phoneBook.get("Мартынова"));
        System.out.println(phoneBook.get("Зведенинов"));
        System.out.println(phoneBook.get("Лаптев"));
    }
}
