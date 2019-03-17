import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
//    private String hamletText;
//    private HamletParser hamletParser;
//
//    @Before
//    public void setUp() {
//        this.hamletParser = new HamletParser();
//        this.hamletText = hamletParser.getHamletData();
//    }

    @Test
    public void testChangeHamletToLeon() {

        String findStr = "Hamlet";
        String repStr = "Leon";
        String fileStr  = "hamlet.txt";
        HamletParser hamletParser = new HamletParser(fileStr, findStr, repStr);
        String expected = hamletParser.getHamletData();
        String actual = hamletParser.getHamletData();

        Assert.assertEquals(expected, actual);
        System.out.println(actual);

    }


    @Test
    public void testChangeHoratioToTariq() {
        String findStr = "Horatio";
        String repStr = "Tariq";
        String fileStr  = "hamlet.txt";
        HamletParser hamletParser = new HamletParser(fileStr, findStr, repStr);
        String expected = hamletParser.getHamletData();
        String actual = hamletParser.getHamletData();

        Assert.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void testFindHoratio() {
        String findStr = "Horatio";
        String repStr = "Tariq";
        String fileStr  = "hamlet.txt";
        HamletParser hamletParser = new HamletParser(fileStr, findStr, repStr);
        Boolean actual = hamletParser.getHamletData().contains(findStr);

        Assert.assertEquals(false, actual);
        System.out.println(actual);

    }

    @Test
    public void testFindHamlet() {

       String findStr = "Hamlet";
       String repStr = "Leon";
       String testFile = "hamlet.txt";

       HamletParser hamletParser = new HamletParser(testFile, findStr, repStr);
      Boolean actual = hamletParser.getHamletData().contains(findStr);

      Assert.assertEquals(false, actual);
        System.out.println(actual);
    }
}