package project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class test {
  
  List<edge> edges1;
  List<edge> edges2;
  String word1;
  String word2;
  String word3;
  String word4;
  String word5;
  String word6;
  String word7;
  String word8;
  String word9;
  @Before
  public void setUp() throws Exception {
     edges1=project1.createDirectedGraph("a c b e a m b f a i b k r t b s r y r v d e i p k o i j k l i h k s");
     edges2=project1.createDirectedGraph("");
     word1 = "a";
     word2 = "b";
     word3 = "e";
     word4 = "m";
     word5 = "r";
     word6 = "z";
     word7 = "g";
     word8 = "i";
     word9 = "k";
    }

  @After
  public void tearDown() throws Exception {
    
  }

  @Test
  public void testQueryBridgeWords() {
    
    //fail("Not yet implemented");
    project1 abc = new project1();
    String result1 = abc.queryBridgeWords( edges1, word1, word2);  //3-n
    assertEquals("The bridge words from a to b are: c, m, and i.",result1);
    String result2 = abc.queryBridgeWords( edges1, word3, word4); //1
    assertEquals("The bridge word from e to m is: a.",result2);
    String result3 = abc.queryBridgeWords( edges1, word4, word2);  //0
    assertEquals("No bridge words from m to b!",result3);
    String result4 = abc.queryBridgeWords( edges1, word2, word5);  //2
    assertEquals("The bridge words from b to r are: k, and s.",result4);
    String result5 = abc.queryBridgeWords( edges1, word2, word6);  //word
    assertEquals("No \"z\" in the graph!",result5);
    String result6 = abc.queryBridgeWords( edges1, word6, word7);  //
    assertEquals("No \"z\" and \"g\" in the graph!",result6);
    String result7 = abc.queryBridgeWords( edges1, word8, word9);  //
    assertEquals("The bridge words from i to k are: b, p, j, and h.",result7);
    String result8 = abc.queryBridgeWords( edges2, word3, word4); //
    assertEquals("No \"e\" and \"m\" in the graph!",result8);
    String result9 = abc.queryBridgeWords( edges1, word6, word2);  //word
    assertEquals("No \"z\" in the graph!",result9);
  }

}
