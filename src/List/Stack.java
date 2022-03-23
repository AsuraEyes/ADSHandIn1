package List;

import java.util.EmptyStackException;

public interface Stack<T> {
    boolean IsEmpty();
    void push(T ele);
    T pop() throws EmptyStackException;
}