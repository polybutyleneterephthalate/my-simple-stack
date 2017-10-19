package deqo.smat.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("executed before every test");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "string";
        simpleStack.push(new Item(element1));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "string";
        simpleStack.push(new Item(element1));
        simpleStack.push(new Item((element1 + "2")));
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void push() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void peek() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1, simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void pop() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0, simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

}