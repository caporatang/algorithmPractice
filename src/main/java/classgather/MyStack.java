package classgather;

import java.util.ArrayList;
import java.util.Stack;

/**
 * packageName : PACKAGE_NAME
 * fileName : classgather.MyStack
 * author : taeil
 * date : 2022/10/28
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2022/10/28        taeil                   최초생성
 */
public class MyStack<T> {
        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item) {
            stack.add(item);
        }

        // LIFO
        public T pop() {
            if (stack.isEmpty()) {
                return null;
            }
            // 어레이리스트에 add를 하면 제일 끝에 인덱스가 추가되어 들어가기 때문에
            // 제일 마지막(최근)에 추가한 데이터를 삭제.
            return stack.remove(stack.size() - 1);
        }
        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }