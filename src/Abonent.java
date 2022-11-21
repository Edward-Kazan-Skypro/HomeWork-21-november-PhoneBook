import java.util.HashMap;

public class Abonent {

    private String name;
    private int number;

    private HashMap<String, Integer> abonents = new HashMap<String, Integer>();

    public Abonent(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Abonent() {

    }
}
