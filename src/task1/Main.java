package task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Самолётик");
        Toy toy2 = new Toy("Машинка");
        Toy toy3 = new Toy("Лодка");

        HashMap<Toy, String> map = new HashMap<>();
        map.put(toy1, toy1.getName());
        map.put(toy2, toy2.getName());
        map.put(toy3, toy3.getName());
        entrySet(map);
        keySet(map);
        values(map);

    }
    public static void entrySet (HashMap map){
        System.out.println(map.entrySet());
    }
    public static void keySet (HashMap map){
        System.out.println(map.keySet());
    }
    public static void values (HashMap map){
        System.out.println(map.values());
    }

}
