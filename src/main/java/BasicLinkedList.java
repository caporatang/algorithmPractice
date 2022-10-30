import classgather.Node;

/**
 * packageName : PACKAGE_NAME
 * fileName : BasicLinkedList
 * author : taeil
 * date : 2022/10/28
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2022/10/28        taeil                   최초생성
 */
public class BasicLinkedList {

    //링크드 리스트의 구조
    // --> 연결 리스트라고도 불림
    // 배열은 순차적으로 연결된 공간에 데이터를 나열하는 데이터 구조이다
    // 링크드 리스트는 떨어진 곳에 존재하는 데이터를 화살표로 연결해서 관리하는 데이터 구조이다

    // 장점 -> 미리 데이터 공간을 미리 할당하지 않아도 된다.
    // 단점 -> 연결을 위한 별도 데이터 공간이 필요해서 저장공간 효율이 높지않다.
    //        연결 정보를 찾는 시간이 필요하므로 접근 속도가 느리다.
    //        중간 데이터 삭제시, 앞뒤 데이터의 연결을 재구성해야 하는 부가적인 작업이 필요하다.

    // 노드(node) : 데이터 저장 단위(데이터값, 포인터)로 구성
    // 포인터(pointer) : 각 노드 안에서, 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간

//    SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
//    MyLinkedList.addNode(1);

    public static void main(String[] args) {
//        Node<Integer> MyLinkedList = new Node<Integer>();
//        MyLinkedList.addNode(1);
//        System.out.println("나는 head : " + MyLinkedList.head.data);
//
//        MyLinkedList.addNode(2);
//        System.out.println("나는 next : " + MyLinkedList.head.next.data);
//
//        MyLinkedList.addNode(3);
//        MyLinkedList.printAll();

        Node<Integer> MyLinkedList2 = new Node<Integer>();
        MyLinkedList2.addNode(1);
        MyLinkedList2.addNode(2);
        MyLinkedList2.addNode(3);
        MyLinkedList2.addNode(4);
        MyLinkedList2.addNode(5);


        // 5라는 데이터를 넣고 1 데이터 뒤에 넣겠다.
//        MyLinkedList2.addNodeInside(5, 1);
//        // 없는 노드 데이터를 입력하면 제일 마지막에 저장된다.
//        MyLinkedList2.addNodeInside(7, 20);
//        MyLinkedList2.printAll();

        // 헤드삭제, 중간삭제, 마지막데이터 삭제로 테스트 완료
        MyLinkedList2.delNode(5);
        MyLinkedList2.printAll();
    }
















}