package classgather;

/**
 * packageName : classgather
 * fileName : MyLinkedList
 * author : taeil
 * date : 2022/10/28
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2022/10/28        taeil                   최초생성
 */
public class PracticeNode<T> {
    public PracticeNode<T> head = null; // --> 첫번째 값을 의미
    public T data;
    public PracticeNode<T> next = null; // --> 포인터 구현

    public PracticeNode() { }

    public PracticeNode(T data) {
        this.data = data;
    }
    public void addNode(T data) {
        if (head == null) {
            head = new PracticeNode<T>(data);
        } else {
            PracticeNode<T> node = this.head;
            while (node.next != null) {
                // 노드의 넥스트가 널이 아니다?
                //  다음 노드가 있다는것을 의미한다.
                // while구문은 링크드리스트의 제일 끝의 노드를 가르킨다.
                node = node.next;
            }
            // 가장끝에 노드에 데이터를 추가
            node.next = new PracticeNode<T>(data);
        }
    }

    public void printAll() {
        if(head != null) {
            PracticeNode<T> node = this.head;
            System.out.println(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }

        }
    }


}