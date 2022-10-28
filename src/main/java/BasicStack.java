import classgather.MyStack;

/**
 * packageName : PACKAGE_NAME
 * fileName : BasicStack
 * author : taeil
 * date : 2022/10/28
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2022/10/28        taeil                   최초생성
 */
public class BasicStack {
    // 데이터를 제한적으로 접근할 수 있는 구조
    // -> 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조
    // 가장 나중에 쌓은 데이터를 가장 먼저 빼낼 수 있는 데이터 구조
    // -> 큐 -> FIFO , 스택 -> LIFO

    // 스택은 LIFO(Last In, First Out) 또는 FILO(First in, Last Out) 데이터 관리 방식을 따른다
    // 대표적으로 스택은 컴퓨터 내부의 프로세스 구조의 함수 동작 방식으로 사용한다
    // 주요 기능 --> push() , pop()이 있다.

    // 장점 -> 구조가 단순해서 구현이 쉽다.
    //        데이터 저장/읽기 속도가 빠름
    // 단점(일반적 스택 구현시) -> 데이터 최대 갯수를 미리 정해야한다.
    //                       저장공간의 낭비가 생길수있다 --> 미리 최대 갯수만큼 저장 공간을 확보해야 한다.

    public static void main(String[] args) {
      MyStack<Integer> myStack = new MyStack<Integer>();

      myStack.push(1);
      myStack.push(2);
      System.out.println(myStack.pop()); // --> 2가 출력이 되어야함

      myStack.push(3);
      System.out.println(myStack.pop()); // --> 3가 출력이 되어야함
      System.out.println(myStack.pop()); // --> 1가 출력이 되어야함
      System.out.println(myStack.isEmpty()); // --> true

    }
}