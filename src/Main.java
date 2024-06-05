import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*zadanie 1*/
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Opel", 2006));
//        cars.add(new Car("Fiat", 2014));
//        cars.add(new Car("Ford", 2004));
//        cars.add(new Car("Nissan", 2002));
//        cars.add(new Car("Audi", 2000));
//        cars.add(new Car("Volkswagen", 2000));
//        cars.add(new Car("Volkswagen", 1998));
//        cars.add(new Car("Toyota", 2013));
//        cars.add(new Car("Honda", 2008));
//        cars.add(new Car("Volvo", 2016));
//
//        Collections.sort(cars);
//
//        for (Car car : cars){
//            System.out.println(car);
//        }

        /*zadanie2*/
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "bike"));
        items.add(new Item(2, "skateboard"));
        items.add(new Item(3, "laptop"));
        items.add(new Item(4, "phone"));
        items.add(new Item(5, "tablet"));
        /*zadanie 3*/
        items.add(new Item(6, "playStation"));
        items.add(new Item(7, "monitor"));
        items.add(new Item(8, "keyboard"));
        items.add(new Item(9, "a"));
        items.add(new Item(10, "b"));
        items.add(new Item(11, "c"));
        items.add(new Item(12, "d"));
        items.add(new Item(13, "e"));
        items.add(new Item(14, "f"));
        items.add(new Item(15, "g"));


        for(int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for(Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        List<Item> firstFiveItems = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        System.out.println("\nElements in HashSet:");
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }

}