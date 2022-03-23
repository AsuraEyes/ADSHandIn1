package List;

public class LinkedList<T> implements List<T>{
    private Node<T> head;
    int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public void addToFront(T data) {
        Node<T> nHead = new Node<>(data);
        nHead.setNextNode(head);
        head = nHead;
        size++;

        System.out.println("Linked List size: " + size);
    }

    @Override
    public T removeFirst() {
        T data = head.getData();
        if(head.getNextNode() == null)
        {
            head = null;
        }
        else
        {
            head.setData(head.getNextNode().getData());
            head.setNextNode(head.getNextNode().getNextNode());
        }
        size--;
        return data;
    }
}

