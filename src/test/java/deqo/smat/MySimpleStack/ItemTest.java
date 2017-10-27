package deqo.smat.MySimpleStack;

import org.junit.Test;
import org.mockito.Mockito;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ItemTest {

    //Item value = mock(Item.class);
    Item value = new Item("");

    @Test
    public void getValue() throws Exception {
        //Mockito.verify(value).setValue("test");
        value.setValue("test");
        assertEquals(value.getValue(), "test");
    }

    @Test
    public void setValue() throws Exception {
        //Mockito.verify(value).setValue("test");
        value.setValue("test");
        assertEquals(value.getValue(), "test");
    }

}

// comment for #4