import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>  colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        System.out.println(colors);
        System.out.println("Second color in the list is: " + colors.get(1));

        colors.remove(0);
        System.out.println("Colors list after removing first color: " + colors);

    }
}
