import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class hw6 {
    public static void main(String[] args) {
        // Реализовать множество (set) с помощью TreeMap.
        TreeMap<Integer, Integer> treeMapData = new TreeMap<>();
        treeMapData.put(6,6);
        treeMapData.put(5,5);
        treeMapData.put(4, 4);
        treeMapData.put(3, 3);
        treeMapData.put(2, 2);
        treeMapData.put(1, 1);
        System.out.println("TreeMap: " + treeMapData);
        Set<Integer> SetData = new HashSet<Integer>(treeMapData.values());
        System.out.println("Set: " + SetData);

        // Создать метод add, добавляющий элемент в ваше множество.
        SetData.add(7);
        System.out.println("Set: " + SetData);

        // Объявить и инициализировать компаратор с обратной (от большего к меньшему) логикой сортировки чисел.
        Comparator<Integer> compare = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        // Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
        TreeSet<Integer> treeSetData = new TreeSet<>(compare);
        treeSetData.addAll(SetData);
        treeSetData.add(8);
        treeSetData.add(0);
        System.out.println("TreeSet with Comparator: " + treeSetData);

    }
}
