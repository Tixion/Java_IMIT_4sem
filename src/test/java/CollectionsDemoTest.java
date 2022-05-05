import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionsDemoTest {
    @Test
    public void countTest(){
        List<String> list = new ArrayList();
        list.add("hello fellow humans");
        list.add("its my pleasure to meet the ones of my kind");
        list.add("i too like to do human activities, like drinking and walking");
        list.add("lets be friends");

        assertEquals(CollectionsDemo.FirstSymbolLineCount(list, 'i'), 2);
    }
    //@Test
    //public void NullStringTest(){
    //    String s = null;
    //    List<String> list = new ArrayList();
    //    list.add(s);
    //    Throwable exception = assertThrows(IllegalArgumentException.class, () -> CollectionsDemo.FirstSymbolLineCount(list, 'a'));
    //}
}
