import java.util.*;

public class 스택구현 {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("size: " + stack.size);
    }
}

class ArrayStack{
    int size;
    int top = -1;
    Object[] stack;

    // 생성자
    ArrayStack(int size){
        this.size = size;
        stack = new Object[size];
    }

    // 요소 추가
    public void push(Object value){
        if (isFull()){
            System.out.println("Stack is full. unable add " + value);
            return;
        }
        stack[++top] = value;
    }

    public Object pop(){
        if (isEmpty()){
            System.out.println("Stack is empty. unable pop.");
            return null;
        }
        return stack[top--];
    }

    public Object peek(){
        if (isEmpty()){
            System.out.println("Stack is empty. unable peek.");
            return null;
        }
        return  stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }
}
