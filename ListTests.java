import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

class VowelChecker implements StringChecker{

    @Override
    public boolean checkString(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if(s.contains("a") || s.contains("i") || s.contains("o")
                || s.contains("e") || s.contains("u")) {
                    return true;
                }
        }
        return false;
    }
    
}
public class ListTests{
    @Test
    public void filterTest(){ 
        List<String> input = new ArrayList<>();
        input.add("ppl");
        input.add("bananas");
        input.add("lyd");
        input.add("grapes");
        List<String> expected = new ArrayList<>();
        expected.add("bananas");
        expected.add("grapes");
        StringChecker sc = new VowelChecker(); 
        assertEquals(expected, ListExamples.filter(input, sc));
    }

    @Test
    public void mergeTest(){
        List<String> input1 = new ArrayList<>();
        input1.add("apples");
        input1.add("cactus");
        input1.add("pineapples");
        List<String> input2 = new ArrayList<>();
        input2.add("avocados");
        input2.add("bananas");
        input2.add("doritos");
        List<String> expected = new ArrayList<>();
        expected.add("apples");
        expected.add("avocados");
        expected.add("bananas");
        expected.add("cactus");
        expected.add("doritos");
        expected.add("pineapples");
        assertEquals(expected, ListExamples.merge(input1,input2));
    }
}