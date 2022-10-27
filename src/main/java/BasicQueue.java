import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class BasicQueue {

    public static void main(String[] args) {
        //가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조
        //음식점에서 가장 먼저 줄을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
        //FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대

        //Enqueue: 큐에 데이터를 넣는 기능
        //Dequeue: 큐에서 데이터를 꺼내는 기능

        // Enqueue 에 해당하는 기능으로 Queue 클래스에서는 add(value) 또는 offer(value) 메서드를 제공함
        // Dequeue 에 해당하는 기능으로 Queue 클래스에서는 poll() 또는 remove() 메서드를 제공함
        // Queue 클래스에 데이터 생성을 위해서는 java.util 패키지에 있는 LinkedList 클래스를 사용해야 함

        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        queue_int.add(2);
        queue_str.offer("나는 스트링 큐에 오퍼");
        queue_str.offer("나는 스트링 큐에 오퍼22");
        System.out.println(queue_int);
        System.out.println(queue_str);
        System.out.println("boolean " + queue_int.offer(3));


        queue_str.poll();
        System.out.println("poll " + queue_str);
        queue_str.poll();
        System.out.println("poll " + queue_str);

        // queue는 어디에 많이 쓰이는가 ?
        // 멀티 태스킹을 위한 프로세스 스케쥴링 방식을 구현하기 위해 많이 사용된다(운영체제)
        // 큐의 경우 장단점 보다는(특별히 언급되는 장단점이 없다), 큐의 활용 예로 프로세스 스케쥴링 방식을 함께 이해하는것이 도움이 된다!

        // ArrayList Class를 사용하여 enqueue, dequeue 기능을 구현해보기
        // dequeue 기능 호출시, 큐에 데이터가 없을 경우 null리턴 시킬것.
        // 다양한 데이터 타입, --> Generic타입 문법을 활용할것.
        MyQueue<Integer> mq = new MyQueue<Integer>();
        System.out.println("---------------------------------테스트-----------------------------------------------");
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.print());

        mq.dequeue();
        mq.dequeue();
        System.out.println(mq.print());

    }

    public static class MyQueue<T> {
        public ArrayList<T> queue = new ArrayList<T>();

        public String print() {
            System.out.println("나는 프린트의 큐 " + queue);
            return "나는 프린트 메서드를 탔어요";
        }
        public void enqueue(T item) {
            queue.add(item);
        }

        public T dequeue() {
            if (queue.isEmpty()) {
                return null;
            }
            return queue.remove(0);
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }



    }




}
