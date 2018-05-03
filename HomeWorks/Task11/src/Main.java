
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new MapByNodesArrayImpl<>();
        map.put("Марсель", 24);
        map.put("Артем", 29);
        map.put("Роман", 25);
        map.put("Настя", 19);
        map.put("Марсель1", 25);
        map.put("Марсель2", 26);
        map.put("Марсель3", 27);
        map.put("Марсель4", 28);
        map.put("Марсель5", 29);
        map.put("Марсель6", 35);
        map.put("Марсель7", 52);
        map.put("Марсель8", 14);


        System.out.println(map.get("Настя"));
        System.out.println(map.get("Марсель"));
        System.out.println(map.get("Роман"));
        System.out.println(map.get("Марсель1"));
        System.out.println(map.get("Марсель2"));
        System.out.println(map.get("Марсель3"));
        System.out.println(map.get("Марсель4"));
        System.out.println(map.get("Марсель5"));
        System.out.println(map.get("Марсель6"));
        System.out.println(map.get("Марсель7"));
    }
}
