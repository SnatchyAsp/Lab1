package project;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
public  class choosefile extends JFileChooser{
	
	public static String fileChooser() {
		
//		JFileChooser chooser = new JFileChooser();
//	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
//	        "JPG & GIF Images", "jpg", "gif");
//	    //设置文件类型
//	    chooser.setFileFilter(filter);
//	    //打开选择器面板
//	    int returnVal = chooser.showOpenDialog(new JPanel());  
//                      //保存文件从这里入手，输出的是文件名
//	    if(returnVal == JFileChooser.APPROVE_OPTION) {
//	       //System.out.println("你打开的文件是: " +
//	         //   chooser.getSelectedFile().getName());
//	            //return chooser.getSelectedFile();
//	       //return chooser.getSelectedFile().getName();
		
		
		JFileChooser jfc = new JFileChooser(); 
    
        jfc.setAcceptAllFileFilterUsed(false);//设置文件过滤条件，在文件选择中没有“所有文件”的选项
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);//设置文件选择类型，在这里只是选择具体文件
       
		        jfc.showOpenDialog(null);
		        File xls = jfc.getSelectedFile();
		        
		        if(xls == null){
		            return "";
		        }
		        String resultOpen = jfc.getSelectedFile().getPath();//获取文件路径
		        return resultOpen;
		    }

	    }
	



