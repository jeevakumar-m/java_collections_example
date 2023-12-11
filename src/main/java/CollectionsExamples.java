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

        // find whether Fruit1
        System.out.println("is fruit1 present -- " + fruits.contains("Fruit1"));
        // to access speicifi index element
        System.out.println("4th index element -- " + fruits.get(4));
        // to access first and Last element
        System.out.println("1st Elment : " + fruits.getFirst());
        System.out.println("lasst Elment : " + fruits.getLast());

        fruits.removeFirst();
        fruits.add(0,"Anton");


        System.out.println(fruits);
        System.out.println(fruits.get(0));

        for (String s: fruits)
        {
            System.out.println("modern for loop=" + s);
        }

        for(int i=0;i<fruits.size();i++)
        {
            System.out.println("Classical for =" + fruits.get(i));
        }

        Iterator<String> it = fruits.iterator();

        while(it.hasNext())
        {
            String s= it.next();
            System.out.println("IT Elements : " +  s);
            if (s.equals("Anton"))
            {
                it.remove();
            }
        }

        System.out.println(fruits);

        // 1,2,3, ....,7600,.... 10000
        ListIterator<String> lit = fruits.listIterator();

        while(lit.hasNext())
        {
            System.out.println("LIT Elements : " +  lit.next());
        }

        while(lit.hasPrevious())
        {
            String s = lit.previous();
            System.out.println("LIT PREV Elements : " +  s);
            if (s.equals("Cucumber"))
            {
                lit.remove();
                lit.add("KJeevasd");
            }
        }

        System.out.println(fruits);

    }

    public static void list_linkedList()
    {
        String[] fruitArray = {"Fruit1", "Fruit2"};
        List<String> fruits = new LinkedList<String>();
        fruits.add("Bananan"); // 0th
        fruits.add("Apple");  // 1st
        fruits.add("Cucumber"); //2nd
        fruits.addAll(Arrays.asList(fruitArray));
        System.out.println(fruits);
        fruits.add(5,"papaya");
        System.out.println(fruits);

        // find whether Fruit1
        System.out.println("is fruit1 present -- " + fruits.contains("Fruit1"));
        // to access speicifi index element
        System.out.println("4th index element -- " + fruits.get(4));
        // to access first and Last element
        System.out.println("1st Elment : " + fruits.getFirst());
        System.out.println("lasst Elment : " + fruits.getLast());

        fruits.removeFirst();
        fruits.add(0,"Anton");


        System.out.println(fruits);
        System.out.println(fruits.get(0));

        for (String s: fruits)
        {
            System.out.println("modern for loop=" + s);
        }

        for(int i=0;i<fruits.size();i++)
        {
            System.out.println("Classical for =" + fruits.get(i));
        }

        Iterator<String> it = fruits.iterator();

        while(it.hasNext())
        {
            String s= it.next();
            System.out.println("IT Elements : " +  s);
            if (s.equals("Anton"))
            {
                it.remove();
            }
        }

        System.out.println(fruits);

        // 1,2,3, ....,7600,.... 10000
        ListIterator<String> lit = fruits.listIterator();

        while(lit.hasNext())
        {
            System.out.println("LIT Elements : " +  lit.next());
        }

        while(lit.hasPrevious())
        {
            String s = lit.previous();
            System.out.println("LIT PREV Elements : " +  s);
            if (s.equals("Cucumber"))
            {
                lit.remove();
                lit.add("KJeevasd");
            }
        }

        System.out.println(fruits);
    }










    public static void main(String args[])
    {
        list_linkedList();
    }
}




