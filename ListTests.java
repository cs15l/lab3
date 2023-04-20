import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;


public class ListTests {
    @Test
    public void testFilter(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Brandon");
        al.add("Ziad");
        al.add("Dhruv");
        al.add("Colby");
        al.add("Shashwat");
        
        assertArrayEquals(new String[]{"Brandon","Shashwat"},ListExamples.filter(al,new LargeString()).toArray());
        
    }
    
    @Test
    public void testMerge(){
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        b.add("a");
        a.add("a");
        b.add("b");
        a.add("b");
        b.add("b");
        a.add("c");
        b.add("e");
        b.add("e");
        b.add("e");
        a.add("d");
        assertArrayEquals(new String[]{"a","a","b","b","b","c","d","e","e","e"},ListExamples.merge(a,b).toArray());
    }
    
}




class LargeString implements StringChecker{
    public boolean checkString(String s){
      return s.length()>5;
    }
}