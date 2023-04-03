package lesson03_class;

import java.util.*;

/*
* Пройтись по списку, выяснить какой элемент число, какой строка.
* */
public class task4_iterator {

    public static void printResultOfCheck(List<String> my_list){
        Iterator<String> my_iterator = my_list.iterator();
        while (my_iterator.hasNext()){
            String item = my_iterator.next();

            try{
                Integer.parseInt(item);
                System.out.println(item + " int");
            }catch (NumberFormatException er){
                System.out.println(item + " string");
            }

        }
    }

    public static void main(String[] args){
        List<String> my_list = new ArrayList<>(Arrays.asList("f", "2", "4","a", "b", "9", "c", "g"));
        System.out.println(my_list);
        printResultOfCheck(my_list);
    }
}