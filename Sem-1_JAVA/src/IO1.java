import java.util.*;
class HelloWorld {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("apple");
        queue.add("banana");
        queue.add("orange");
        queue.offer("pear");
        System.out.print(queue.remove() +" " + queue.element());
        System.out.println(queue); } }
