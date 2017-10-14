package project;
import java.awt.*;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

import java.util.*;
import java.util.Queue;
import java.util.Timer;
import java.io.*;
import java.util.List;

import project.project1;
import project.choosefile;

public class GUIlauncher extends JFrame {
	/*
	JLabel bq1;
	JButton an1,an2,an3;  JPanel mb1;//�ϲ�
	JTabbedPane xxk;//�в�
	JPanel mb2,mb3,mb4;
	JLabel bq2,bq3,bq4,bq5;
	JTextField wbk;
	JPasswordField mmk;
	JButton an4;
	JCheckBox fxk1,fxk2;
	
	*/
	JComboBox jcb;
	JLabel lb;
	JButton b1 = new JButton("showDirectedGraph!");
	JButton b2 = new JButton("save into graph");	
	JButton b3 = new JButton(" search Bridge words of two:");
	JButton b4 = new JButton("new text is :");
	JButton b5 = new JButton("calcShortestPath of two");
	JButton b6 = new JButton("the table of the shortest way of the word:");
	JButton b7 = new JButton("random work");
	ACTION action = new ACTION();
	ACTION2 action2 = new ACTION2();
	ACTION3 action3 = new ACTION3();
	ACTION4 action4 = new ACTION4();
	ACTION5 action5 = new ACTION5();
	ACTION6 action6 = new ACTION6();
	ACTION7 action7 = new ACTION7();
	
	String Str,randomworkStr;
	String filename;
	String new_filename;
	String Strgraph = "";
	String new_filename2;
	List<project1.edge> edges=new ArrayList();
	List<project1.edge> edges1=new ArrayList();
	String[] reswords  = new String[100];
	//static String graph ="" ;
	int temp1;
	 JPanel       p,p1,p2,p3,p4,p5,p6,p7,p_login,contentPanel;
	 JButton      bLogin,bok,bExit,Success,bcontinue,bstop,bsave;
	 JLabel       In1,In2,OUT,new_text,OUT_RESULT;
	 JTextField   INPUT1,INPUT2,OUTPUT,INPUT_text,OUT_new_text;
	 JTextArea		Shortestway,TXT,OUTPUT_RESULT;
	 JScrollPane   scroll;
	 JMenuBar jb;
	 JTextArea ja;
	 
	public GUIlauncher() {
		// TODO Auto-generated constructor stub
		
		//������ʽ���ֹ�����
		GridLayout flow =  new GridLayout(2,3,8,6);
		Container con = getContentPane();
		con.setLayout(flow);
		
		
		//����		
		
		//lb = new JLabel("function chosen :",JLabel.RIGHT);
		
		b1.addActionListener(action);
		b2.addActionListener(action);
		b3.addActionListener(action);
		b4.addActionListener(action);
		b5.addActionListener(action);
		b6.addActionListener(action);
		b7.addActionListener(action);
		//jcb = new JComboBox();
		//jcb.addItem("showDirectedGraph");
				
		//������
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(b6);
		con.add(b7);
		setTitle("project-lab1");  //����
		setLocation(200,200);    //��ʾλ��
		setSize(1200,900);       //�����С
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رմ��ں���ֹ
		/*
		bq2=new JLabel("qq����",JLabel.CENTER);
		bq3=new JLabel("qq����",JLabel.CENTER);
		bq4=new JLabel("��������",JLabel.CENTER);
		bq4.setFont(new Font("����",Font.PLAIN,16));
		bq4.setForeground(Color.BLUE);
		bq5=new JLabel("�������뱣��");
		bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//��������ʾ����״
		wbk=new JTextField();
		mmk=new JPasswordField();
		an4=new JButton(new ImageIcon("images/an4.jpg"));
		fxk1=new JCheckBox("�����½");
		fxk2=new JCheckBox("��������");
		bq1=new JLabel(new ImageIcon("images/bq1.jpg"));
		mb1=new JPanel();//�ϲ�
		an1=new JButton(new ImageIcon("images/an1.jpg"));
		an2=new JButton(new ImageIcon("images/an2.jpg"));
		an3=new JButton(new ImageIcon("images/an3.jpg"));
		xxk=new JTabbedPane();//�в�
		mb2=new JPanel(); mb3=new JPanel();
		mb3.setBackground(Color.BLUE);
		mb4=new JPanel();
		mb4.setBackground(Color.GREEN);
		xxk.add("��ͨ�û�",mb2); xxk.add("QQ��Ա",mb3); xxk.add("����Ա",mb4);
		mb2.setLayout(new GridLayout(3,3));
		mb1.add(an1);  mb1.add(an2);  mb1.add(an3);
		mb2.add(bq2);  mb2.add(wbk);  mb2.add(an4);  mb2.add(bq3);  mb2.add(mmk);
		mb2.add(bq4);  mb2.add(fxk1);  mb2.add(fxk2);  mb2.add(bq5);
		this.add(mb1,BorderLayout.SOUTH);
		this.add(bq1,BorderLayout.NORTH);
		this.add(xxk,BorderLayout.CENTER);
		ImageIcon tp1=new ImageIcon("images/QQ14.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("��½����");
		this.setSize(1200,900);
		   this.setLocation(300,280);
		   this.setResizable(false);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setVisible(true);
		   */
		filename = choosefile.fileChooser();
		File filename1 = new File(filename);
		//System.out.println(file);
		filename = filename.replaceAll( "\\\\ ",   "\\\\\\\\ ");
		Str =  project1.txtOpen(filename1);
		WindowText win2 = new WindowText("result");
		}
	
	class WindowText extends JFrame  
	{  
	    //JTextField text1;  
	    WindowText(String s)  
	    {  
	        super(s);  
	        setLayout(new GridLayout());  
	        //text1 = new JTextField("Success"); 
	        
	        Success = new JButton("Success");
	        Success.addActionListener(action4);
	        //text1.setEditable(false);  	        
	        //add(text1);
	        this.add(Success);
	        setBounds(500, 500, 200, 150); 
	        this.addWindowListener (new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                setVisible (false);
	                //System.exit(0);
	            }
	    });
	        setVisible(true);  
	        validate();//ȷ�����������Ч�Ĳ���  
	          
	    }  
	}
	
	class WindowText2 extends JFrame  
	{  
	    JTextField text1;  
	    WindowText2(String s)  
	    {  
	        this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  p_login=new JPanel();
		  p1=new JPanel();
		  p2=new JPanel();
		  p3=new JPanel();
		  p4=new JPanel();
		  p5=new JPanel();
		  p6=new JPanel();
		  p7=new JPanel();
		  p_login.setLayout(new GridLayout(4,2));
		  bLogin=new JButton("ok");
		  bLogin.addActionListener(action2);
		  In1=new JLabel("in1");
		  In2=new JLabel("in2");
		  OUT = new JLabel("OUT");
		  INPUT1=new JTextField(30);
		  //INPUT1.addComponentListener(action2);
		  INPUT2=new JTextField(30);
		  //INPUT2.addComponentListener(action2);
		  OUTPUT = new JTextField(30);
		  p1.add(In1);
		  p2.add(INPUT1);
		  p3.add(In2);
		  p4.add(INPUT2);
		  
		  p6.add(OUT);
		  p7.add(OUTPUT);
		  p5.add(bLogin);
		  p_login.add(p1);
		  p_login.add(p2);
		  p_login.add(p3);
		  p_login.add(p4);
		  
		  p_login.add(p6);
		  p_login.add(p7);
		  p_login.add(p5);
		  p.add(p_login);
		  this.add(p,"Center");
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1200, 500);
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);
		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}

	class WindowText5 extends JFrame  
	{  
	    JTextField text1;  
	    WindowText5(String s)  
	    {  
	        this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  p_login=new JPanel();
		  p1=new JPanel();
		  p2=new JPanel();
		  p3=new JPanel();
		  p4=new JPanel();
		  p5=new JPanel();
		  p6=new JPanel();
		  p7=new JPanel();
		  p_login.setLayout(new GridLayout(4,2));
		  bLogin=new JButton("ok");
		  bLogin.addActionListener(action5);
		  In1=new JLabel("in1");
		  In2=new JLabel("in2");
		  OUT = new JLabel("OUT");
		  INPUT1=new JTextField(30);
		  //INPUT1.addComponentListener(action2);
		  INPUT2=new JTextField(30);
		  //INPUT2.addComponentListener(action2);
		  Shortestway = new JTextArea(10,30);
		  p1.add(In1);
		  p2.add(INPUT1);
		  p3.add(In2);
		  p4.add(INPUT2);
		  p5.add(bLogin);
		  p6.add(OUT);
		  p7.add(Shortestway);
		  
		  p_login.add(p1);
		  p_login.add(p2);
		  p_login.add(p3);
		  p_login.add(p4);
		  
		  p_login.add(p6);
		  p_login.add(p7);
		  p_login.add(p5);
		  p.add(p_login);
		  //p.add(p5);
		  this.add(p,"Center");
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1600, 800);
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);
		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}
	
	class WindowText6 extends JFrame  
	{  
	    WindowText6(String s)  
	    {  
	        this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  scroll = new JScrollPane();
		  p_login=new JPanel();
		  p1=new JPanel();
		  p2=new JPanel();
		  p5=new JPanel();
		  p6=new JPanel();
		  p7=new JPanel();
		  p_login.setLayout(new GridLayout(4,2));
		  bLogin=new JButton("ok");
		  bLogin.addActionListener(action6);
		  In1=new JLabel("in1");
		  //In2=new JLabel("in2");
		  OUT = new JLabel("OUT");
		  INPUT1=new JTextField(30);
		  Shortestway = new JTextArea(10,30);
		  //INPUT1.addComponentListener(action2);
		  //INPUT2=new JTextField(30);
		  //INPUT2.addComponentListener(action2);
		  
		  //scroll.setPreferredSize(new Dimension(5, 5));
		  //contentPanel = new JPanel();
		  //scroll.add(contentPanel );
		  //contentPanel.add(new JLabel("OUT"), BorderLayout.NORTH);
		  //contentPanel.add(Shortestway, BorderLayout.CENTER);
		  
		  //contentPanel.add(scroll, BorderLayout.EAST);
		  //contentPanel.add(comp)
		  //JPanel radioPanel= new JPanel();
		 // radioPanel.add(new JRadioButton("ͬ��"));
		  //radioPanel.add(new JRadioButton("��ͬ��"));
		  jb = new JMenuBar();
		  this.setJMenuBar(jb);
		  //ja = new JTextArea();
		  scroll = new JScrollPane(Shortestway);
		  //this.setSize(600, 400);
		  //this.setLayout(new BorderLayout());
		  //this.add(scroll);
		  //this.setVisible(true);
		  //contentPanel.add(radioPanel, BorderLayout.SOUTH);
		  //scroll.setViewport(Shortestway);
		  
		  p1.add(In1);
		  p2.add(INPUT1);
		 // p3.add(In2);
		  //p4.add(INPUT2);
		  p5.add(bLogin);
		  //p6.add(OUT);
		  //p7.add(Shortestway);
		  
		  p_login.add(p1);
		  p_login.add(p2);
		  //p_login.add(p3);
		  //p_login.add(p4);
		  
		  //p_login.add(p6);
		  //p_login.add(p7);
		  p_login.add(p5);
		  //p_login.add(contentPanel);
		  p.add(scroll);
		  p.add(p_login);
		  //p.add(p5);
		  this.add(p,"Center");
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1200, 600);
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);
		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}

	class WindowText7 extends JFrame  
	{  
	    WindowText7(String s)  
	    {  
	      this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  p_login=new JPanel();
		  p1=new JPanel();
		  p2=new JPanel();
		  p3=new JPanel();
		  p4=new JPanel();
		  p5=new JPanel();
		  p_login.setLayout(new GridLayout(3,2));
		  bcontinue=new JButton("continue");
		  bcontinue.addActionListener(action7);
		  bstop=new JButton("stop");
		  bstop.addActionListener(action7);
		  bsave=new JButton("save");
		  bsave.addActionListener(action7);
		  //In1=new JLabel("in1");
		  //In2=new JLabel("in2");
		  OUT_RESULT = new JLabel("OUT_RESULT");
		  //INPUT1=new JTextField(30);
		  //INPUT1.addComponentListener(action2);
		  //INPUT2=new JTextField(30);
		  //INPUT2.addComponentListener(action2);
		  OUTPUT_RESULT = new JTextArea(10,30);
		  p1.add(bcontinue);
		  p2.add(bstop);
		  p3.add(OUT_RESULT);
		  p4.add(OUTPUT_RESULT);
		  p5.add(bsave);
		  p_login.add(p1);
		  p_login.add(p2);
		  p_login.add(p3);
		  p_login.add(p4);
		  p_login.add(p5);
		  p.add(p_login);
		  this.add(p,"Center");
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1200, 500);
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);
		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}

	class WindowText0 extends JFrame  
	{  
	    WindowText0(String s)  
	    {  
	        this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  p_login=new JPanel();
		  p7=new JPanel();
		  p_login.setLayout(new GridLayout(4,2));
		  TXT = new JTextArea(10,30);
		  jb = new JMenuBar();
		  this.setJMenuBar(jb);
		  //ja = new JTextArea();
		  scroll = new JScrollPane(TXT);
		  //p7.add(TXT);
		  p_login.add(p7);
		  p.add(p_login);
		  p.add(scroll);
		  //p.add(p5);
		  this.add(p,"Center");
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1200, 600);
        for(int i=0;i<edges.size();i++)
		{
			TXT.append("From:"+edges.get(i).start_node+"  To:"+edges.get(i).end_node+"  Weight:"+edges.get(i).weight+"\n");
			//System.out.println();
		}
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);
		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}
	
	class ACTION2 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			  JButton btn=(JButton) e.getSource(); 
//			  if(btn==bExit){
//				  setVisible (false);
//			      System.exit(0);
//			  }
			  if(btn==bLogin){
			   String word1=INPUT1.getText();
			   String word2=INPUT2.getText();
			   //System.out.println(username);
			   String result = project1.queryBridgeWords(edges,word1,word2);
			   OUTPUT.setText(result);
			  } 
			  
		}
	}
	
	class ACTION4 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			  JButton btn=(JButton) e.getSource(); 
			  if(btn == Success){
				  //setVisible (false);
				  //System.exit(0);
			  } 
			  
		}
	}
	
	class WindowText4 extends JFrame  
	{  
	    WindowText4(String s)  
	    {  
	        this.setLayout(new GridLayout());  	          	      	        
		  p=new JPanel();
		  p_login=new JPanel();
		  p1=new JPanel();
		  p2=new JPanel();
		  p3=new JPanel();
		  p5=new JPanel();
		  p6=new JPanel();
		  p7=new JPanel();
		  p_login.setLayout(new GridLayout(2,4));
		  bok=new JButton("ok");
		  bok.addActionListener(action3);
		  bExit=new JButton("Exit");
		  new_text=new JLabel("newtext");
		  OUT = new JLabel("OUT");
		  INPUT_text=new JTextField(30);
		  OUT_new_text = new JTextField(30);
		  p1.add(new_text);
		  p2.add(INPUT_text);	  
		  p6.add(OUT);
		  p7.add(OUT_new_text);
		  p5.add(bok);
		  p3.add(bExit);
		  p_login.add(p1);
		  p_login.add(p2);
		  p_login.add(p5);
		  p_login.add(p6);
		  p_login.add(p7);
		  p_login.add(p3);
		  p.add(p_login);
		  this.add(p);
        //setBounds(500, 500, 200, 150);
        this.setBounds(400, 400, 1300, 500);
        this.addWindowListener (new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible (false);
                //System.exit(0);
            }
    });
		this.setVisible(true);		 
        //setVisible(true);  
        validate();//ȷ�����������Ч�Ĳ���  
	    }     
	     
	}
	
	class ACTION3 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			  JButton btn=(JButton) e.getSource(); 
			  if(btn==bExit){
				  setVisible (false);
			      //System.exit(0);
			  }
			  if(btn==bok){
			   String newtext =INPUT_text.getText();
			   //String word2=INPUT2.getText();
			   //System.out.println(username);
			   String result = project1.generateNewText(edges,newtext);
			   OUT_new_text.setText(result);
			  } 
			  
		}
	}
	
	class ACTION5 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			  JButton btn=(JButton) e.getSource(); 
//			  if(btn==bExit){
//				  setVisible (false);
//			      System.exit(0);
//			  }
			  if(btn==bLogin){
			   String word1=INPUT1.getText();
			   String word2=INPUT2.getText();
			   //System.out.println(username);
			   List<String> a=project1.calcShortestPath(edges ,word1,word2);
			   for(int i=0;i<a.size();i++)
		  		{
		  			
				   Shortestway.append(a.get(i)+"\n");
		  		}
		  		if(a.size()==0)
		  		{
		  			Shortestway.setText("no such way\n");
		  		}
			   //OUTPUT.setText(a);
			  } 
			  
		}
	}
	
	class ACTION6 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			  JButton btn=(JButton) e.getSource();
			  
//			  if(btn==bExit){
//				  setVisible (false);
//			      System.exit(0);
//			  }
			  if(btn==bLogin){
			   String word1=INPUT1.getText();
			   //String word2=INPUT2.getText();
			   //System.out.println(username); 		
				List<String> check=new ArrayList();
				
				for(int temp=0;temp<edges.size();temp++)
				{
					//List<String> b=calcShortestPath(edges ,search3,search4);
					if(check.contains(edges.get(temp).start_node)) 
						continue;
					check.add(edges.get(temp).start_node);
					Shortestway.append("The shortest way(s) from "+word1+" to "+edges.get(temp).start_node+" is(are):");
					List<String> b=project1.calcShortestPath(edges ,word1,edges.get(temp).start_node);
					Shortestway.setLineWrap(true);        //�����Զ����й��� 
					  Shortestway.setWrapStyleWord(true);
					for(int j=0;j<b.size();j++)
					{
		  			
						Shortestway.append(b.get(j)+"\n");
					}
					if(b.size()==0)
					{
						Shortestway.append("no such way\n");
					}
				}
			  } 
			  
		}
	}
	
	class ACTION7 implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
				
			  JButton btn=(JButton) e.getSource();
			  String a = project1.randomWalk(edges);
			  int count = 0;
			  reswords = a.split(" ");
			  if(btn==bcontinue){

				  temp1 = 0;				
//				  OUTPUT_RESULT.append(reswords[count]+" ");
//				  count++;
			  }
			  if(btn==bstop){
				  temp1 = 1;
					 //OUTPUT_RESULT.append("\n The stop ;");
//			   a=project1.randomWalk(edges);
////			   String newtext =INPUT_text.getText();
////			   //String word2=INPUT2.getText();
////			   //System.out.println(username);
////			   String result = project1.generateNewText(edges,newtext);
//			   OUT_new_text.setText(a);
				  //System.out.println("The stop");
			  } 
//			  if(btn == bsave)
//			  {
//				  //Strgraph += "";
//      			edges1=project1.createDirectedGraph(project1.domain(Strgraph));
//				  GraphViz gv1 = new GraphViz();
//			    gv1.addln(gv1.start_graph());
//			    //gv.addln("A -> B;A->C;");
//			    //gv.addln("A -> C;");	    
//			    //?????????????	    
//			    for(int i = 0;i<edges1.size();i++)
//				{
//			    	gv1.addln(edges1.get(i).start_node+" -> "+edges.get(i).end_node+";");
//				}	    
//			    //gv.addln(graph);	    
//			    gv1.addln(gv1.end_graph());
//			    //System.out.println(gv.getDotSource());	    
//			    String type = "jpg";
//			    new_filename2 = choosefile.fileChooser();
//				File new_filename1 = new File(new_filename2);
//				//System.out.println(file);
//				new_filename2 = new_filename2.replaceAll( "\\\\ ",   "\\\\\\\\ ");
//			    //new_filename+='.';
//			    File out = new File(new_filename1 + type);   // out.gif in this example
//			    gv1.writeGraphToFile( gv1.getGraph( gv1.getDotSource(), type ), out );
//			    WindowText win8 = new WindowText("result");
//				  
//			  }
			  	
			  //System.out.println(a);
			  Timer timer = new Timer();
			  TimerTask task = new TimerTask() {
			        private int count = 0;			  
			        @Override
			        public void run(){
			        	if(temp1 == 1)
						  {
			        			//OUTPUT_RESULT.append("The stop \n");
			        			
							  //OUTPUT_RESULT.append(reswords[count]+"\n");
							  //System.gc();
			        			
								timer.cancel();
						  }
			        	  OUTPUT_RESULT.append(reswords[count]+" ");
			        	  Strgraph += reswords[count]+" ";
						  this.count++;
					  
						  OUTPUT_RESULT.setLineWrap(true);        //�����Զ����й��� 
						  OUTPUT_RESULT.setWrapStyleWord(true); 
						  
					  }
			    };
			  timer.schedule(task, 0,500);			  
			  //randomworkStr = project1.randomWalk(edges);
		}
	}
	class ACTION implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
					
			Object source = e.getSource();			
			
			//File file = new File(choosefile.fileChooser().chooser);
			//String file=choosefile.filechooser().getSelectedFile().getName();
			
			//System.out.println(Str1);
			//System.out.println("1");
			if(source == b1)
			{
				//Str = project1.txtOpen(filename);
				//System.out.println("2");
				edges=project1.createDirectedGraph(project1.domain(Str));
				//��ʾ����ͼ
				//project1.showDirectedGraph(edges);
				WindowText0 win0 = new WindowText0("showDirectedGraph");
				
			}
			else if(source == b2)
			{
				
				//2-����jpg�ļ�
				//+"[label = \""+ edges.get(i).weight+"\"];"
				GraphViz gv = new GraphViz();
			    gv.addln(gv.start_graph());
			    //gv.addln("A -> B;A->C;");
			    //gv.addln("A -> C;");	    
			    //?????????????	    
			    for(int i = 0;i<edges.size();i++)
				{
			    	gv.addln(edges.get(i).start_node+" -> "+edges.get(i).end_node+"[label = \""+ edges.get(i).weight+"\"];");
				}	    
			    //gv.addln(graph);	    
			    gv.addln(gv.end_graph());
			    //System.out.println(gv.getDotSource());	    
			    String type = "jpg";
			    new_filename = choosefile.fileChooser();
				File new_filename1 = new File(new_filename);
				//System.out.println(file);
				new_filename = new_filename.replaceAll( "\\\\ ",   "\\\\\\\\ ");
			    //new_filename+='.';
			    File out = new File(new_filename1 + type);   // out.gif in this example
			    gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
			    WindowText win1 = new WindowText("result");
				//System.out.println("Success!");
			}
				
			else if(source == b3)
			{
				new WindowText2("bridge words");
				//System.out.println("23");
			}
			else if(source == b4)
			{
				//System.out.println("24");
				WindowText4 win4 = new WindowText4("new text is:");
			}
				
			else if(source == b5)
			{
				WindowText5 win5 = new WindowText5("calcShortestPath");
			}
			else if(source == b6)
			{
				//System.out.println("6");
				String search3;
				String search4;
				WindowText6 win6 = new WindowText6("the table of the shortest way of the word:");
	  		
	  		
			}
			else
			{
				WindowText7 win7 = new WindowText7("randomwalk");
				//System.out.println("7");
			}
				
			
		}
	}
}