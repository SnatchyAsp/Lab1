package project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class Testforwhite1 {
  List<edge> edges;
  String input;
  @Before
  public void setUp() throws Exception {
    edges=project1.createDirectedGraph("To explore strange new worlds, To seek out new life and new civilizations");
    input="One";
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGenerateNewText() {
    project1 abc = new project1();
    String result1 = abc.generateNewText(edges,input);  
    assertEquals("One",result1);
  }

}
