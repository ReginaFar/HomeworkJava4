
import java.util.LinkedList;
import java.util.Random;

/*
 * Задание 1.
​
Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список.
 */

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            newList.add(random.nextInt(100));
        }
        System.out.println(newList);
        System.out.print(reverseLinkedList(newList));
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist) {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}