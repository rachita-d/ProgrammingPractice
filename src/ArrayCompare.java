import java.util.ArrayList;

public class ArrayCompare {
    public static void main(String[] args) {
        ArrayList<String> actionsList = new ArrayList<String>();
        ArrayList<String> ascActionsList = new ArrayList<String>();

        actionsList.add("1");
        actionsList.add("1");
        actionsList.add("1");
        actionsList.add("1");

        ascActionsList.add("1");
        ascActionsList.add("1");
        ascActionsList.add("2");
        ascActionsList.add("1");

        if (actionsList.equals(ascActionsList))
            System.out.println("List equal");
        else
            System.out.println("Not equal");
    }
}