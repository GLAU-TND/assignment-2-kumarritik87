package problem3.main;


import problem3.myqueue.MyPriorityQueue;
import problem3.Student;


public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Ritik",58));
        queue.enqueue(new Student("HArshit",23));
        queue.enqueue(new Student("Harsh",65));
        queue.enqueue(new Student("Jayant",1));
        queue.enqueue(new Student("Mehul",10));

        queue.enqueue(new Student("Divyanshu",76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}