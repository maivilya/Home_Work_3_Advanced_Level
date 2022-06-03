import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PhoneBook {
    private HashMap<String, List<String>> map = new HashMap<>();
    private List<String> phonenumber;

    public void add(String surname, String phone_number) {
        if (map.containsKey(surname)) {
            map.get(surname);
            phonenumber.add(phone_number);
            map.put(surname, phonenumber);
        } else {
            phonenumber = new ArrayList<>();
            phonenumber.add(phone_number);
            map.put(surname, phonenumber);
        }
    }

    public List<String> get(String surname) {
        return map.get(surname);
    }

}
