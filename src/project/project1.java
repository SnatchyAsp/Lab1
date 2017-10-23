package project;
//it is a test
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;

import java.util.Scanner;
import java.util.Queue;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import project.GUIlauncher;
import project.choosefile;

import java.util.*;

public class project1 {
	
	static String[] words = new String[100000];
	String Str;
	static String graph ="" ;
	 //String Strbridge;
	//int graph[][]=new int[100][100];
	//List<String> Point = new LinkedList<String>();
	static int temp;
	
	public String getString()
	{
		return Str;
	}

	public void setString(String Str)
	{
		this.Str = Str;
	}
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub	
		
		//GUI界面显示
		//(1)FlowLayout   (2)Borderlayout (3)GridLayout (4)CardLayout (5)GridBagLayout
		
		/*
		Frame f = new Frame();
		f.setTitle("project-lab1");
		f.setSize(1200,900);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setLayout(new GridLayout(3,1,80,80));
		
		
		JButton b1 = new JButton("show the created graph!");
		JButton b2 = new JButton("search Bridge words");
		JButton b3 = new JButton("create bridge new text");
		JButton b4 = new JButton("calculate the shortset way from two words");
		JButton b5 = new JButton("The table of the one word of the shortest way");
		//b5.setBounds(200, 200, 400, 400);
		//Button b6
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		*/
		//MouseMotionTest frame = new MouseMotionTest();
		//String filename;
		
		//filename = choosefile.fileChooser();
		
		GUIlauncher pic = new GUIlauncher();
		//choosefile.fileChooser();
		
//		//1-读入文件get s	
//		//输入字符串
		//String name;
		//System.out.println("请输入文件路径：");
		//Scanner input = new Scanner(System.in);
		//name = input.next();
		//File file = new File("C:\\Users\\junruitian\\workspace\\Project\\ac.txt");
		//File file = new File(name);
		//System.out.println(file.exists());
		//循环输入
//		while(!file.exists())
//			{
//			//name = input.next();			
//			System.out.println( "The file does not exist! Try another one");
//			name = input.next();
//			File newfile = new File(name);
//			file=newfile;			
//			}
		
        //System.out.println(txtOpen(file));
		//String Str = txtOpen(file);
//
//		
//		
		//2-建立生成并显示有向图
//		List<edge> edges=new ArrayList();
//		//生成有向图
//		edges=createDirectedGraph(domain(Str));
//		//显示有向图
//		showDirectedGraph(edges);
//		
//				
//		//String dotFormat="1->2;1->3;1->4;4->5;4->6;6->7;5->7;3->8;3->6;8->7;2->8;2->5;";
//        //createDotGraph(dotFormat, "DotGraph");
//		//3-生成jpg文件
//		//+"[label = \""+ edges.get(i).weight+"\"];"
//		GraphViz gv = new GraphViz();
//	    gv.addln(gv.start_graph());
//	    //gv.addln("A -> B;A->C;");
//	    //gv.addln("A -> C;");	    
//	    //?????????????	    
//	    //for(int i = 0;i<edges.size();i++)
//		//{
//	    //	gv.addln(edges.get(i).start_node+" -> "+edges.get(i).end_node+"[label = \""+ edges.get(i).weight+"\"];");
//		//}	    
//	    gv.addln(graph);	    
//	    gv.addln(gv.end_graph());
//	    //System.out.println(gv.getDotSource());	    
//	    String type = "jpg";
//	    File out = new File("C:\\Users\\junruitian\\workspace\\Project\\abc." + type);   // out.gif in this example
//	    gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
//		//System.out.println(Str);
//		
//	    //4-桥接词
//	    String result ;
//	    System.out.println("The two words are：");
//	    Scanner input2 = new Scanner(System.in);
//	    String word1 = input2.next();
//	    String word2 = input2.next();
//	    //String word1 = "new";
//	    //String word2 = "and";
//	    result = queryBridgeWords(edges,word1,word2);
//	    System.out.println(result);
//	    
//	    //5-生成新文本
//	    System.out.println("new Text is:");
//	    //String newtext;
//	    Scanner input3 = new Scanner(System.in);
//	    String newtext = input3.nextLine();
//	    /*
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    try {
//	    String newtext = br.readLine();
//	    } catch (IOException e) {
//	    e.printStackTrace();
//	    }
//		*/
//	    //String newtext = "Seek to explore new and exciting synergies ";
//	    System.out.println(generateNewText(edges,newtext));
//	    
//	    //6-计算最短路径
//  		String search1 ;
//  		String search2 ;
//  		System.out.println("the shortest way from a to b :");
//  		Scanner input4 = new Scanner(System.in);
//  		search1 = input4.next();
//  		search2 = input4.next();
//  		//String ads = calcShortestPath(edges ,word1,word2)<1>;
//  		List<String> a=calcShortestPath(edges ,search1,search2);
//  		for(int i=0;i<a.size();i++)
//  		{
//  			
//  			System.out.println(a.get(i));
//  		}
//  		if(a.size()==0)
//  		{
//  			System.out.println("no such way");
//  		}
//  		
//  		//7-对于单个单词最短路径处理
//  		String search3;
//  		String search4;
//  		System.out.println("the table of the shortest way of the word:");
//  		search3 = input4.next(); 		
//		List<String> check=new ArrayList();
//		for(int temp=0;temp<edges.size();temp++)
//		{
//			//List<String> b=calcShortestPath(edges ,search3,search4);
//			if(check.contains(edges.get(temp).start_node)) 
//				continue;
//			check.add(edges.get(temp).start_node);
//			System.out.println("The shortest way(s) from "+search3+" to "+edges.get(temp).start_node+" is(are):");
//			List<String> b=calcShortestPath(edges ,search3,edges.get(temp).start_node);			
//			for(int j=0;j<b.size();j++)
//			{
//  			
//				System.out.println(b.get(j));
//			}
//			if(b.size()==0)
//			{
//				System.out.println("no such way");
//			}
//		}
//		
			//8-随机游走
//			String a="";
//			a=randomWalk(edges);
//			System.out.println(a);
//			a=randomWalk(edges);
//			System.out.println(a);
//			a=randomWalk(edges);
//			System.out.println(a);
//			a=randomWalk(edges);
//			System.out.println(a);
//			a=randomWalk(edges);
//			System.out.println(a);

	}
	
	//将txt文件打开
	public static String txtOpen(File file){
		
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
	
	//路径文件处理
	public static List<File> getFileList(String path){//获取路径下的文件列表
        File[] files = new File(path).listFiles();
        List<File> fileList = new ArrayList<File>();
        for(File file:files){
            fileList.add(file);
        }
        return fileList;
    }
	
	//字符串处理

	public static String domain(String Str)
	{
		 
//		Str = Str.replaceAll("\\\\",   " ");
//		Str = Str.replaceAll("/", " ");
//		Str = Str.replaceAll("\\.", " ");
//		Str = Str.toLowerCase();
//		Str = Str.replaceAll("\\n", " ");
//		Str = Str.replaceAll("\\t"," ");
//		Str = Str.replaceAll("\\r"," ");
//		Str = Str.replaceAll(",", " ");
//        
//        Str = Str.replaceAll(";", " ");
//        Str = Str.replaceAll("\\(", " ");
//        Str = Str.replaceAll("\\)", " ");
//        Str = Str.replaceAll(":", " ");
//        Str = Str.replaceAll("[?]", " ");
//        Str = Str.replaceAll("@", " ");
//        Str = Str.replaceAll(" +"," ");
		Str = Str.replaceAll("[^a-zA-Z0-9]+"," ");
        //Str = Str.replaceAll("\"","\\\"");
//        System.out.println("1"+Str);
		//Str = Str.replaceAll("\W", " ");
//        String string;
//        
//        for(int i=1;i<Str.length();i++)
//        {
//        	string[i-1]=Str.substring(i, i);
//        	
//        }
        Str=Str.substring(1);
        return Str;
	}	
	//生成对象
	public static class edge
	{
		String start_node;
		String end_node;
		int weight;
		
	}
	
	public static List<edge> createDirectedGraph(String Str)
	{
		//domain(Str);
		words = Str.split(" ");
		//System.out.println(Str);
		
		int n = 0;
		for(int i = 0; i < words.length; i++)
		{
			if(null != words[i]) 
				n++;
		}
		
		List<edge> edges=new ArrayList();
		//String new_start=words[0];
		int cnt=1;
		while(cnt!=n)
		{
			int i;
			String new_start=words[cnt-1];
			String new_end=words[cnt];
			for(i=0;i<edges.size();i++)
			{
				if(edges.get(i).start_node.equals(new_start)&&edges.get(i).end_node.equals(new_end))
				{					
					edges.get(i).weight++;
					break;
				}
//				else
//				{
//					edge new_edge=new edge();
//					new_edge.start_node=new_start;
//					new_edge.end_node=new_end;
//					new_edge.weight=1;
//					edges.add(new_edge);
//				}
			}
			if(i==edges.size())
			{
				edge new_edge=new edge();
				new_edge.start_node=new_start;
				new_edge.end_node=new_end;
				new_edge.weight=1;
				edges.add(new_edge);
			}
					
			cnt++;
		}
		
		//生成jpg的字符串
		
		for(int i = 0;i<edges.size();i++)
		{
			
			graph += (edges.get(i).start_node+" -> "+edges.get(i).end_node+"[label = \""+ edges.get(i).weight+"\"];");
		}
		
		return edges;
				
	}
	
	public static void showDirectedGraph(List<edge> edges)
	{
		for(int i=0;i<edges.size();i++)
		{
			System.out.print("From:"+edges.get(i).start_node+"  To:"+edges.get(i).end_node+"  Weight:"+edges.get(i).weight);
			System.out.println();
		}
	}
	
	/** List order maintained  list查重 **/      
	
	public static void removeDuplicateWithOrder(List<String> arlList)      
	{      
		Set set = new HashSet();      
		List newList = new ArrayList();
		//List<String> Point = new LinkedList<String>();
		for (Iterator iter = arlList.iterator(); iter.hasNext(); )      
		{      
			Object element = iter.next();      
			if (set.add(element)) 
				newList.add(element);      
		}      
		arlList.clear();      
		arlList.addAll(newList);      
	}
	
	public static void createDotGraph(String dotFormat,String fileName)
	 {
	     GraphViz gv=new GraphViz();
	     gv.addln(gv.start_graph());
	     gv.add(dotFormat);
	     gv.addln(gv.end_graph());
	    // String type = "gif";
	     String type = "jpg";
	   // gv.increaseDpi();
	     gv.decreaseDpi();
	     gv.decreaseDpi();
	     File out = new File(fileName+"."+ type); 
	     gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
	 }
	
	public static String queryBridgeWords(List<edge> edges, String word1, String word2)
	{
		int a = 0;
		int b = 0;
		String answer=new String();
		List<String> bridge_word=new ArrayList();
		for(int i=0;i<edges.size();i++)
		{
			if(edges.get(i).start_node.equals(word1))
			{
				a=1;
				String new_start=edges.get(i).end_node;
				//String.copyValueOf(word1);
				for(int j=0;j<edges.size();j++)
				{
					if(edges.get(j).end_node.equals(word2)&&edges.get(j).start_node.equals(new_start))
					{
						b=1;
						bridge_word.add(new_start);
					}
				}
			}
		}
		if(a==0)
		{
			for(int i=0;i<edges.size();i++)
			{
				if(edges.get(i).end_node.equals(word1)) 
					a=1;
			}
		}
		if(b==0)
		{
			for(int i=0;i<edges.size();i++)
			{
				if(edges.get(i).end_node.equals(word2)||edges.get(i).start_node.equals(word2)) 
					b=1;
			}
		}
		if(a==0&&b==0)
		{
			//System.out.println("No "+"“"+word1+"”"+" and “"+word2+"”"+" in the graph!");
			answer += ("No "+"“"+word1+"”"+" and “"+word2+"”"+" in the graph!");
		}
		else if(a==1&&b==0)
		{
			//System.out.println("No "+"“"+word2+"”"+" in the graph!");
			answer += ("No "+"“"+word2+"”"+" in the graph!");
		}
		else if(a==0&&b==1)
		{
			//System.out.println("No "+"“"+word1+"”"+" in the graph!");
			answer += ("No "+"“"+word1+"”"+" in the graph!");
		}
		else if(bridge_word.size()>1)
		{
			//System.out.print("The bridge words from word1 to word2 are: ");
			answer +=("The bridge words from "+word1+" to "+word2+" are: ");
			for(int i=0;i<bridge_word.size()-1;i++)
			{
				//System.out.print(bridge_word.get(i)+", ");
				answer += (bridge_word.get(i)+", ");
			}
			//System.out.println("and "+bridge_word.get(bridge_word.size()-1)+".");
			answer += ("and "+bridge_word.get(bridge_word.size()-1)+".");
			//return answer;
		}
		else if(bridge_word.size()==1)  //"."???是不是有点多
		{
			//System.out.print("and "+bridge_word.get(bridge_word.size()-1)+".");
			answer += ("The bridge word from "+word1+" to "+word2+" is: ");
			//System.out.println(bridge_word.get(bridge_word.size()-1)+".");
			answer += (bridge_word.get(bridge_word.size()-1)+".");
			//return answer;
		}
		else if(bridge_word.size()==0)
		{
			//System.out.println("No bridge words from" +word1+" to "+ word2+"!" );
			answer += ("No bridge words from " +word1+" to "+ word2+"!") ;
			
		}
		return answer;
	}
	
	public static String generateNewText(List<edge> edges, String inputText)
	{
		
		String[] new_words = new String[1000];
		new_words=inputText.split(" ");
		int n = 0;
		int add=0;
		int cnt=1;
		String new_string=new String();
		for(int i = 0; i < new_words.length; i++)
		{
			if(null != new_words[i]) 
				n++;
		}
		while(cnt!=n)
		{
			//String new_start=words[cnt-1];
			//String new_end=words[cnt];
			List<String> bridge_word=new ArrayList();
			for(int i=0;i<edges.size();i++)
			{
				
				if(edges.get(i).start_node.equals(new_words[cnt-1]))
				{
					
					String new_start=edges.get(i).end_node;
					//String.copyValueOf(word1);
					for(int j=0;j<edges.size();j++)
					{
						if(edges.get(j).end_node.equals(new_words[cnt])&&edges.get(j).start_node.equals(new_start))
						{
							
							bridge_word.add(new_start);
						}
					}
				}
			}
			new_string+=new_words[cnt-1];
			new_string+=" ";
			if(bridge_word.size()==1)
			{
				new_string+=bridge_word.get(0);
				new_string+=" ";
			}
			else if(bridge_word.size()>1)
			{
				
				Random random=new Random();
				int rand_int=random.nextInt(bridge_word.size());
				new_string+=bridge_word.get(rand_int);
				new_string+=" ";
			}
			if(cnt==n-1)
			{
				new_string+=new_words[cnt];
				//new_string+=" ";
			}
			//else new_string+=new_words[cnt];
	
			cnt++;
			//return new_string;
			
			
			
		}
		return new_string;
//		for(int i=0;i<edges.size();i++)
//		{
//			if(edges.get(i).start_node.equals(word1))
//			{
//				//a=1;
//				String new_start=edges.get(i).end_node;
//				//String.copyValueOf(word1);
//				for(int j=0;j<edges.size();j++)
//				{
//					if(edges.get(j).end_node.equals(word2)&&edges.get(j).start_node.equals(new_start))
//					{
//						//b=1;
//						bridge_word.add(new_start);
//					}
//				}
//			}
//		}
	}

	public static List<String> calcShortestPath(List<edge> edges, String word1, String word2)
	{
		List<String> path=new ArrayList();
		List<List<String>> final_paths=new ArrayList();
		Queue<List<String>> paths=new  LinkedList<List<String>>();
		path.add(word1);
		paths.offer(path);
		String new_start=word1;
		String new_end=word2;
		List<String> ans=new ArrayList();
		while(!paths.isEmpty())
		{
			new_start=paths.peek().get(paths.peek().size()-1);
			for(int i=0;i<edges.size();i++)
			{
				List<String> new_path=new ArrayList();
				
				if(edges.get(i).start_node.equals(new_start))
				{
					new_end=edges.get(i).end_node;
					for(int j=0;j<paths.peek().size();j++)
					{
						new_path.add(paths.peek().get(j));
					}
					if(!new_path.contains(new_end))
					{
						new_path.add(new_end);
						if(new_path.get(new_path.size()-1).equals(word2))
						{
							final_paths.add(new_path);
							break;
						}
						paths.add(new_path);
					}
					
				}
			}
			paths.poll();
			
			
		}
		int shortest=Integer.MAX_VALUE;
		for(int i=0;i<final_paths.size();i++)
		{
			//ans[i]=final_paths.get(i);
			String temp="";
			int cnt=0;
			for(int j=0;j<final_paths.get(i).size();j++)
			{
				//temp+=
				
				temp+=final_paths.get(i).get(j);
				temp+=" ";
				cnt++;
			}
			temp+=" length:"+(final_paths.get(i).size()-1);
			if(shortest>=cnt) 
				{
					shortest=cnt;
					ans.add(temp);
					continue;
				}
			
		}
		
		//List<String> Path = new ArrayList<String>();
//		List<String> new_Path = new ArrayList<String>();
//		String new_start;
//		//String new_end;
//		int length = 0;
//		int new_length = Integer.MAX_VALUE;
//		new_start = word1;
//		int[] visit = new int[edges.size()];
//		
//		//visit访问数组初始置0
//		for(int i=0;i<edges.size();i++)
//			visit[i] = 0;
		
		//最短路径的搜索
//		for(int i=0;i<edges.size();i++)
//		{
//			for(int j=0;j<edges.size();j++)//while(visit[i] != 1)
//			while(visit[i] != 1)
//			{
//				if(edges.get(j).start_node.new_start )
//				{
//					Path.add(edges.get(j).start_node);
//					new_start = edges.get(j).end_node;
//					length++;
//					visit[j] = 1;
//				}
//				if(edges.get(j).end_node == word2)
//				{
//					if(length < new_length)
//					{
//						new_length = length;
//						Path = new_Path;
//					}
//				}
//			}
//					
//		}
//		
//		return "123";
		
		return ans;
	}

	public static String randomWalk(List<edge> edges)
	{
		
		Random random=new Random();
		int rand_int=random.nextInt(edges.size());
		//String word1="T";
		String word1=edges.get(rand_int).start_node;
		List<String> sol=new ArrayList();
		String ans="";
		while(1==1)
		{
			List<String> path=new ArrayList();
			for(int i=0;i<edges.size();i++)
			{
				if(edges.get(i).start_node.equals(word1))
				{
					path.add(edges.get(i).end_node);
					//if(temp==1) return path;
				}
			}
			int new_rand=0;
			if(path.size()==0) 
				break;
			else if(path.size()==1) 
				new_rand=0;
			else new_rand=random.nextInt(path.size());
			int flag=0;
			for(int i=0;i<sol.size()-1;i++)
			{
				if((sol.get(i).equals(word1)&&sol.get(i+1).equals(path.get(new_rand))))
				{
					sol.add(word1);
					sol.add(path.get(new_rand));
					flag=1;
					break;
				}
//				if((sol.get(i).equals(word1)&&sol.get(i+1).equals(path.get(new_rand)))||(sol.get(i+1).equals(word1)&&word1.equals(path.get(new_rand))))
//				{
//					sol.add(word1);
//					sol.add(path.get(new_rand));
//					flag=1;
//					break;
//				}
			}
	
			if(sol.size()!=0)
			{
				if(sol.get(sol.size()-1).equals(word1)&&word1.equals(path.get(new_rand)))
				{
					sol.add(word1);
					sol.add(path.get(new_rand));
					//flag=1;
					break;
				}
			
			}
			
		
			//if(sol.get(index))
			if(flag==1) break;

//			if(sol.contains(path.get(new_rand))&&sol.contains(word1))
//			{
//				sol.add(word1);
//				sol.add(path.get(new_rand));
//				break;
//			}
			sol.add(word1);
			word1=path.get(new_rand);
		}
		for(int i=0;i<sol.size();i++)
		{
			if(temp==1) break; 
			ans+=sol.get(i);
			ans+=" ";
		}
		return ans;

	
	}
}

