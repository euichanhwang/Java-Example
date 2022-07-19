package lang.collection;

import java.util.ArrayList;

public class Exam70 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

        for(String name:list)
            System.out.print(name + " ");

    }
}
