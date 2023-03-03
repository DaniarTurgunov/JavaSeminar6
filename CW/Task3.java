package Seminar6.CW;

import java.util.*;

import static java.lang.System.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("qwe","v"));
        Map<String, Integer> mapList = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapList.putIfAbsent(list.get(i),0);
            mapList.put(list.get(i), mapList.get(list.get(i))+1);
        }
        for (int i = 0; i < list2.size(); i++) {
            mapList.putIfAbsent(list2.get(i),0);
            mapList.put(list2.get(i), mapList.get(list2.get(i))+1);
        }
        Set<String> setList = new HashSet<>(list);
        setList.retainAll(new HashSet<>(list2));
        if (setList.size() > 0) {
            for (String el : setList) {
                System.out.printf("%s = %d%n", el, mapList.get(el));
            }
        }
        else System.out.println("Пересечений нет!");
    }
}
