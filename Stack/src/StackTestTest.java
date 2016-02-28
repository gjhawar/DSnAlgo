import junit.framework.TestCase;

/**
 * Created by gjhawar on 10/30/15.
 */
public class StackTestTest extends TestCase {
    private Stack<Integer> s1;
    private Stack<Integer> s2;


    public void setUp(){
        s1 = new AStack<Integer>();
        s2 = new AStack<Integer>(3);
    }

    public void testGeneral(){
        s2.push(10);
        s2.push(20);
        s2.push(30);

        assertEquals("< 30 20 10 >", s2.toString());
        while(s2.length()!=0){
            s1.push(s2.pop());
        }
        assertEquals("< 10 20 30 >", s1.toString());
        assertEquals("< >", s2.toString());
    }


}