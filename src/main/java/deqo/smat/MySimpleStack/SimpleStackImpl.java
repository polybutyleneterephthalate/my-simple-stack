package deqo.smat.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
    /**
     * Stack.
     */
    Stack<Object> wrappedStack = new Stack<Object>();

    /**
     * Know if stack is empty
     *
     * @return boolean, correspondant à si la stack est vide ou non.
     */
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    public int getSize() {
        return wrappedStack.size();
    }

    public void push(Item item) {
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}