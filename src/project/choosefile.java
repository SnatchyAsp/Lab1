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
//	    //�����ļ�����
//	    chooser.setFileFilter(filter);
//	    //��ѡ�������
//	    int returnVal = chooser.showOpenDialog(new JPanel());  
//                      //�����ļ����������֣���������ļ���
//	    if(returnVal == JFileChooser.APPROVE_OPTION) {
//	       //System.out.println("��򿪵��ļ���: " +
//	         //   chooser.getSelectedFile().getName());
//	            //return chooser.getSelectedFile();
//	       //return chooser.getSelectedFile().getName();
		
		
		JFileChooser jfc = new JFileChooser(); 
    
        jfc.setAcceptAllFileFilterUsed(false);//�����ļ��������������ļ�ѡ����û�С������ļ�����ѡ��
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);//�����ļ�ѡ�����ͣ�������ֻ��ѡ������ļ�
       
		        jfc.showOpenDialog(null);
		        File xls = jfc.getSelectedFile();
		        
		        if(xls == null){
		            return "";
		        }
		        String resultOpen = jfc.getSelectedFile().getPath();//��ȡ�ļ�·��
		        return resultOpen;
		    }

	    }
	



