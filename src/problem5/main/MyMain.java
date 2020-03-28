package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue  =new MyCircularQueue(3);
        myCircularQueue.enqueue(new Student("ritik",0,0));
        myCircularQueue.enqueue(new Student("harshit",1,1));
        myCircularQueue.enqueue(new Student("jayant",1,0));
        for(int i=0;i<myCircularQueue.getSize()+1;i++){
            Student s = myCircularQueue.dequeue();
//            System.out.println(s);
            if(s.getBackLog()-s.getAppearingCount()!=0){
                myCircularQueue.enqueue(s);
            }
        }
        myCircularQueue.show();
    }
}