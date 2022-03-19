package collections;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        int [] niz = new int[]{1, 2, 3};

        //Collections


        List list = new ArrayList<>();
        list.add(5);
        list.add("Text");
        list.add(50.25);
        list.add(true);

        for (Object o: list) {
            System.out.println(o);
        }

        System.out.println("Pre remove: " + list);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println("Posle remove" + list);

        List<String> stringList = new LinkedList<>(Arrays.asList("text 1", "text 2"));//[]->[]->[]
        for (String s: stringList) {}

        List<Integer> integerList = new ArrayList();
        integerList.add(5);
        integerList.add(10);
        integerList.add(55);
        for (int a: integerList) {
            System.out.println(a);
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        System.out.println("Integer lista pre clear: " + integerList);
        integerList.clear();
        System.out.println("Integer lista nakon clear: " + integerList);


        if (integerList.isEmpty()){
            System.out.println("Lista je prazna!");
        }else {
            System.out.println(integerList);
        }

        if (integerList.size() > 0){
            System.out.println(integerList);
        }else {
            System.out.println("Lista je prazna!");
        }

        String[] stringNiz = {"el1", "el2", "el3"};

        List<String> stringList1 = new ArrayList<>(Arrays.asList(stringNiz));
        stringList1.add("el4");
        System.out.println(stringList1);

        boolean res = stringList1.contains("el2");
        System.out.println(res);


        List<Integer> integerList2 = new ArrayList(Arrays.asList(4,5,8,9,9,8,7));

        Set<Integer> set = new HashSet<>(integerList2);
        set.add(4);
        System.out.println(set);




    }



}
