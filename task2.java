
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/*
 * Задание 2:
Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myList.add(random.nextInt(100));
        }
        System.out.printf("Исходный список: " + myList);
        System.out.println();
        Queue<Integer> myQueue = new LinkedList<Integer>();
        for (Integer i : myList) {
            myQueue.add(i);
        }
        System.out.printf("Переделали в очередь: " + myQueue);
        System.out.println();
        System.out.printf("Добавили элемент в конец очереди: " + enqueue(myQueue));
        System.out.println();
        System.out.printf("Удалили первый элемент очереди:" + dequeue(myQueue));
        System.out.println();
        System.out.printf("Первый элемент очереди: " + first(myQueue));
    }

    public static Queue<Integer> enqueue(Queue<Integer> queue) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Введите число:");
            int number = iScanner.nextInt();
            queue.add(number);
            return queue;
        }
    }

    public static Queue<Integer> dequeue(Queue<Integer> queue) {
        queue.poll();
        return queue;
    }

    public static Integer first(Queue<Integer> queue) {
        return queue.peek();
    }

}
