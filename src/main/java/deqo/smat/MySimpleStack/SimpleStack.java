package deqo.smat.MySimpleStack;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if the stack is empty
     */
    public boolean isEmpty();
    /**
     * Returns the number of items in this stack
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack
     */
    public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack ad returns that object as the value of this function
     * @throws EmptyStackException if this stack is empty
     */
    public Item pop() throws EmptyStackException;

}


// comment for issue #2

// comment for issue 3