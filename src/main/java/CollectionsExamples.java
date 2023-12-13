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

    public static void list_stack()
    {
        String[] fruitArray = {"Fruit1", "Fruit2"};
        List<String> fruits = new Stack<String>();
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

    public static void stack_example(String expression)
    {

        boolean isValid = true;
        Stack<Character> exp_balancer = new Stack<>();
        Character comp = null;
        for(Character ch : expression.toCharArray())
        {
            if (ch=='{' || ch == '(' || ch == '[')
            {
                //push
                exp_balancer.push(ch);
            }
            else {


                    switch (ch) {
                        case '}':
                            if(!exp_balancer.isEmpty())
                            {comp = exp_balancer.pop();}
                            if (comp != '{' ) {
                                isValid = false;
                            }
                            break;
                        case ']':
                            if(!exp_balancer.isEmpty())
                            {comp = exp_balancer.pop();}
                            if (comp != '[' ) {
                                isValid = false;
                            }
                            break;
                        case ')':
                            if(!exp_balancer.isEmpty())
                            {comp = exp_balancer.pop();}
                            if ( comp != '(') {
                                isValid = false;
                            }
                            break;
                    }

            }

            if(!isValid)
            {
              break;
            }
        }

        System.out.println("Is this a valid expression : " + isValid);
    }

    public static void queue_example()
    {
        Queue<Integer> qInt = new PriorityQueue<>();
        Integer[] arr = {12,3,4,5,6};

        qInt.addAll(Arrays.asList(arr));
        qInt.add(100);
        qInt.add(1);
        qInt.add(2);

        System.out.println(qInt);

        System.out.println("peek"+qInt.peek());

        qInt.remove();
        System.out.println(qInt);
        System.out.println("peek"+qInt.peek());

        System.out.println("Poll = " + qInt.poll());
        System.out.println(qInt);
        System.out.println("Peek" + qInt.peek());


        Iterator<Integer> it = qInt.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        for (int i:qInt)
        {
            System.out.println(i);
        }




    }








    public static void main(String args[])
    {
//        stack_example("({[{}()]})");
//        stack_example("{{[[(())]]}}");
//        stack_example("{}[]()");
//        stack_example("({[{}()]})}");
//        stack_example("{{[[(())]}}");
          queue_example();

    }
}




