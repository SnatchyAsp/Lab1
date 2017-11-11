package project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project.project1.edge;

public class Testforwhite4 {
  List<edge> edges;
  String input;
  @Before
  public void setUp() throws Exception {
    edges=project1.createDirectedGraph("To explore strange new worlds, To seek out new life and new civilizations");
    input="To out life new";
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGenerateNewText() {
    project1 abc = new project1();
    String result1 = abc.generateNewText(edges,input);  
    assertEquals("To seek out new life and new",result1);
  }

}
