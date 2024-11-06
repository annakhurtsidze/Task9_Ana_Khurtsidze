import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(5);
        numbers.add(7);

        System.out.println("numbers set first look: " +numbers);

        if(numbers.contains(7)){
            System.out.println("Number contains number 7");
        }

        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}
