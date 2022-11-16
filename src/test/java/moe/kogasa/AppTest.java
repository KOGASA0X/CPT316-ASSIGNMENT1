package moe.kogasa;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        int[] test=new int[100];
        for (int i : test) {
            assertTrue(i==0);
        }
    }

    @Test
    public void Test()
    {
        ArrayList<String> testList=new ArrayList<String>();
        testList.add("which");
        testList.add("there");
        testList.add("their");
        testList.add("about");
        testList.add("would");
        testList.add("these");

        Logic logic=new Logic();
        testList=logic.lsd(testList);

        ArrayList<String> expect=new ArrayList<String>();
        expect.add("about");
        expect.add("their");
        expect.add("there");
        expect.add("these");
        expect.add("which");
        expect.add("would");

        assertTrue(testList.equals(expect));
    }
}
