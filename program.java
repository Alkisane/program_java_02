import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Z1{
       // Добавляем номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
// Печатает список контактов
public static void printBook(Map<String, ArrayList<Integer>> map){
    for (var item : map.entrySet()) {
        String phones = «»;
        for(int el: item.getValue()){
            phones = phones + el + «, «;
        }
        System.out.printf(«%s: %s \n», item.getKey(), phones);
    }
}
public static void main(String[] args) {
    Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
    addNumber(«Zaicev», 123, bookPhone);
    addNumber(«Romanov», 1234, bookPhone);
    addNumber(«Korolev», 546585, bookPhone);
    addNumber(«Romanov», 8956477, bookPhone);
    addNumber(«Zaicev», 12356233, bookPhone);
    addNumber(«Zaicev», 787897, bookPhone);
    printBook(bookPhone);
   }
