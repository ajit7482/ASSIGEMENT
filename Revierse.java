import java.util.ArrayList;

public class Revierse {
    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        hs.add("apple");
        hs.add("banana");
        hs.add("orange");
        System.out.println("========ORIGINAL ELEMENT=============================");
        for (String ArrayList : hs) {
            System.out.println(ArrayList);
        }
        System.out.println("========REVERSE ELEMENT=============================");
        for (int i = hs.size() - 1; i >= 0; i--) {
            System.out.println(hs.get(i));
        }

    }

}
