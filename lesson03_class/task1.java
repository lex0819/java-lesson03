package lesson03_class;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("Yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("white");
        System.out.println(colors);
        for (String color: colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        System.out.println(colors.get(0));
        colors.set(1, "Black");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        System.out.println(colors.indexOf("blue"));
    }
}

