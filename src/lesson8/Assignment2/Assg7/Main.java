package lesson8.Assignment2.Assg7;

public class Main {

    public static void main(String[] args) {
        // Test the GenericMap class
        GenericMap<String, Integer> map = new GenericMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Does map contain key 'Four'? " + map.containsKey("Four"));

        map.remove("Two");

        System.out.println("Value for key 'Two' after removal: " + map.get("Two"));
    }
}
