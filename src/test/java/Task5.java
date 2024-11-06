import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Print with foreach loop");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("Print with classic for loop");
        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        System.out.println("Print with iterator");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Print with foreach iterator with lambda expression");
        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println("Print with foreach method reference");
        fruits.forEach(System.out::println);
     }
}
