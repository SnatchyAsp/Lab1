package project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project.project1.edge;

public class Testforwhite2 {
  List<edge> edges;
  String input;
  @Before
  public void setUp() throws Exception {
    edges=project1.createDirectedGraph("To explore strange new worlds, To seek out new life and new civilizations");
    input="Seek to explore new and exciting synergies";
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGenerateNewText() {
    project1 abc = new project1();
    String result1 = abc.generateNewText(edges,input);  
    assertEquals("Seek to explore strange new life and exciting synergies",result1);
  }

}
