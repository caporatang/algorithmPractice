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
public class Node<T> {
    public Node<T> head = null; // --> 첫번째 값을 의미
    public T data;
    public Node<T> next = null; // --> 포인터 구현

    public Node() { }

    public Node(T data) {
        this.data = data;
    }
    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                // 노드의 넥스트가 널이 아니다?
                //  다음 노드가 있다는것을 의미한다.
                // while구문은 링크드리스트의 제일 끝의 노드를 가르킨다.
                node = node.next;
            }
            // 가장끝에 노드에 데이터를 추가
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    //노드를 순회
    public Node<T> search(T data) {
        if(this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;

            while(node != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    // 연결되어 있는 링크드리스트 중간, 중간에 연결된게 없다면 마지막에 데이터가 입력되게 하는 메서드
    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    } //addNode

    // 노드를 삭제하고 삭제된것을 제외하고 다음 노드끼리 연결
    public boolean delNode(T isData) {
        // 순회한다 --> 데이터를 검색해서 찾는과정
        // 헤드부터시작
        if(this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if(node.data == isData) {
                // 삭제할게 헤드에 있다면, 다음 노드를 헤드로 만들어줘야함.
                this.head = this.head.next;
                return true;
            } else {
                //삭제할게 head가 아니면
                while(node.next != null) {
                    if(node.next.data == isData) {
                        // 포인터값을 변경
                        node.next = node.next.next;
                        //삭제가 됐으니까 트루
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }


    }
}