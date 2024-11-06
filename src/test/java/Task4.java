public class Task4 {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello World");
        System.out.println("String value " + stringWrapper.getValue());


        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14);
        System.out.println("Double value " +doubleWrapper.getValue());

        stringWrapper.setValue("Adios");
        System.out.println("String value " + stringWrapper.getValue());

        doubleWrapper.setValue(7.79);
        System.out.println("Double value " +doubleWrapper.getValue());
    }
}
