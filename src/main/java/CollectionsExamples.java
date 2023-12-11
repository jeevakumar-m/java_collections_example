import java.util.*;

public class CollectionsExamples {

    public static void list_arrayList()
    {
        String[] fruitArray = {"Fruit1", "Fruit2"};
        List<String> fruits = new ArrayList<String>();

        fruits.add("Bananan"); // 0th
        fruits.add("Apple");  // 1st
        fruits.add("Cucumber"); //2nd
        fruits.addAll(Arrays.asList(fruitArray));
        System.out.println(fruits);
        fruits.add(5,"papaya");
        System.out.println(fruits);




    }










    public static void main(String args[])
    {
        list_arrayList();
    }
}




