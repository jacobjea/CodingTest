class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}


interface List<T>{
    public void insert(T value);
    public T getFirst();
    public T removeFirst();
    public boolean isEmpty();
}

class OrderedLinkedList<T> implements List<T>{
    class Node{
        T value;
        Node next;

        Node(T value){
            this.value = value;
            this.next = null;
        }
    }
    private Node head = null;

    public void insert(T value) {
        Node newNode = new Node(value);
        if (head == null){
            newNode.next = head;
            head = newNode;
        } else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public T getFirst() {
        if (isEmpty()){
            throw new RuntimeException("list에 가져올 요소가 없습니다.");
        }
        return head.value;
    }

    public T removeFirst() {
        if (isEmpty()){
            throw new RuntimeException("list에 제거할 요소가 없습니다.");
        }
        T value = head.value;
        head = head.next;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
