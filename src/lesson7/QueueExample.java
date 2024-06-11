package lesson7;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(51);
        queue.enqueue("Java");
        queue.enqueue("C#");
        queue.enqueue("Go");
        queue.enqueue("Scala");
        queue.enqueue("Python");
        System.out.println(queue);
        queue.enqueue(null);
        System.out.println(queue);
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println("queue.dequeue() = " + queue.dequeue());
        System.out.println(queue);
    }
}
