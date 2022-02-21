//1181203232 1181203435 1181202829
//WOOI JIN YANG WEE QIAO FENG AMEER LUQMAN
//PJ3V
//GROUP 22
//Student Information System

import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentInfo {
        
    public static void main(String[] args){
        
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        
        Object[] columns = {"Student Id","Name","Age","Course"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);

        int red = 100;
        int green = 100;
        int blue = 150;
        
        table.setBackground(new Color(153,255,153));
        table.setForeground(Color.black);
        Font font = new Font("",1,15);
        table.setFont(font);
        table.setRowHeight(30);

        JLabel sid = new JLabel("Student ID : ");
        Font id = new Font("Courier New",1,14);
        sid.setFont(id);
        JLabel name = new JLabel("Name : ");
        Font nm = new Font("Courier New",1,14);
        name.setFont(nm);
        JLabel age = new JLabel("Age : ");
        Font ag = new Font("Courier New",1,14);
        age.setFont(ag);
        JLabel course = new JLabel("Course : ");
        Font cs = new Font("Courier New",1,14);
        course.setFont(cs);
        JLabel welcome = new JLabel("Welcome to student information system :)");
        JLabel error = new JLabel("");
     
        ImageIcon icon = new ImageIcon("C:\\Users\\hqtey\\Documents\\NetBeansProjects\\Java Assignment\\src\\student.jpg");
        JLabel image = new JLabel(icon);
        ImageIcon addicon = new ImageIcon("C:\\Users\\hqtey\\Documents\\NetBeansProjects\\Java Assignment\\src\\add.png");
        ImageIcon updateicon = new ImageIcon("C:\\Users\\hqtey\\Documents\\NetBeansProjects\\Java Assignment\\src\\uplooad.png");
        ImageIcon deleteicon = new ImageIcon("C:\\Users\\hqtey\\Documents\\NetBeansProjects\\Java Assignment\\src\\delete.png");
        
        JTextField textId = new JTextField();
        JTextField textName = new JTextField();
        JTextField textAge = new JTextField();
        JTextField textCourse = new JTextField();
        
        JButton btnAdd = new JButton("Insert",addicon);
        JButton btnDelete = new JButton("Delete",deleteicon);
        JButton btnUpdate = new JButton("Update",updateicon);     
        JButton btnInfo = new JButton("Click Me For Infomation :)");
        
        textId.setBounds(110, 255, 120, 30);
        textName.setBounds(110, 300, 120, 30);
        textAge.setBounds(110, 345, 120, 30);
        textCourse.setBounds(110, 390, 120, 30);

        btnAdd.setBounds(250, 265, 110, 35);
        btnUpdate.setBounds(250, 320, 110, 35);
        btnDelete.setBounds(250, 375, 110, 35);
        btnInfo.setBounds(410, 250,300,35);

        sid.setBounds(8,256,110,25);
        name.setBounds(8,302,100,25);
        age.setBounds(8,346,100,25);
        course.setBounds(8,391,100,25);
        welcome.setBounds(380,300,500,25);
        image.setBounds(760,220,800,500);
        image.setSize(200,200);
        welcome.setText("Welcome to Student Infomation System :)");
        Font fn = new Font("Arial",1,18);
        welcome.setFont(fn);
        welcome.setForeground(new Color(125,28,28));
        btnAdd.setHorizontalTextPosition(JButton.RIGHT);
        error.setBounds(10,210,600,25);
        error.setText("Please fill up the form");
        error.setForeground(new Color(0,200,0));
        Font f = new Font("Courier New",1,20);
        error.setFont(f);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 990, 200);
        
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(textId);
        frame.add(textName);
        frame.add(textAge);
        frame.add(textCourse);
        frame.add(error);
        
        frame.add(sid);
        frame.add(name);
        frame.add(age);
        frame.add(course);
        frame.add(welcome);
        frame.add(image);
        
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnInfo);
       
        Object[] row = new Object[4];
        
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                String Name;
                String id;
                String age;
                String course;
                
                row[0] = textId.getText();
                row[1] = textName.getText();
                row[2] = textAge.getText();
                row[3] = textCourse.getText();
                
                if(e.getSource()== btnAdd)
                {
                    Name = textName.getText();
                    id = textId.getText();
                    age = textAge.getText();
                    course = textCourse.getText();

                    if(textId.getText().equals(""))
                    {
                        error.setText("ID cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else if(textName.getText().equals(""))
                    {
                        error.setText("Name cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else if(textAge.getText().equals(""))
                    {
                        error.setText("Age cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else if(textCourse.getText().equals(""))
                    {
                        error.setText("Course cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else
                    {
                        model.addRow(row);
                        error.setText("Sucefully Added !");
                        error.setForeground(new Color(0,200,0));
                    }
                }
            }
        });

        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                int i = table.getSelectedRow();
                if(i >= 0)
                {
                    // remove a row from jtable
                    model.removeRow(i);
                    error.setText("Sucessful delete !");
                    error.setForeground(new Color(0,200,0));
                }
                else{
                    error.setText("Please select row to delete !");
                    error.setForeground(new Color(250,0,0));
                }
            }
        });

        table.addMouseListener(new MouseAdapter()
        {
        
            @Override
            public void mouseClicked(MouseEvent e)
            {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textId.setText(model.getValueAt(i, 0).toString());
                textName.setText(model.getValueAt(i, 1).toString());
                textAge.setText(model.getValueAt(i, 2).toString());
                textCourse.setText(model.getValueAt(i, 3).toString());
            }
        });

        btnUpdate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {

                int i = table.getSelectedRow();
                String Name;
                String id;
                String age;
                String course;

                if(e.getSource()== btnAdd)
                    {
                        Name = textName.getText();
                        id = textId.getText();
                        age = textAge.getText();
                        course = textCourse.getText();
                    }
                else if(textName.getText().equals(""))
                    {
                        error.setText("Name cannot blank !");
                        error.setForeground(Color.red);
                    }
                else if(textAge.getText().equals(""))
                    {
                        error.setText("Age cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else if(textCourse.getText().equals(""))
                    {
                        error.setText("Course cannot blank !");
                        error.setForeground(Color.red);
                    }
                    else if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(textName.getText(), i, 1);
                   model.setValueAt(textAge.getText(), i, 2);
                   model.setValueAt(textCourse.getText(), i, 3);
                   error.setText("Successful Updated !");
                   error.setForeground(new Color(0,200,0));
                }
                else if(i<=0)
                {
                   error.setText("Please select row to update !");
                   error.setForeground(new Color(250,0,0));
                }
            }
        });
        
        btnInfo.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            JDialog d = new JDialog(frame,"Student Infomation System Description");
            d.setSize(500,300);
            d.setLayout(new BorderLayout());
            
            d.setVisible(true);
            
            JLabel textInfo = new JLabel("   This is a Simple Student Infomation System :)"); 
            d.add(textInfo,BorderLayout.NORTH);
            textInfo.setForeground(new Color(230,0,0));
            Font inf = new Font("Papyrus",Font.BOLD,20);
            textInfo.setFont(inf);
            
            JLabel textFun = new JLabel("Function Description"); 
            d.add(textFun);
            textFun.setBounds(0,25,300,40);
            textFun.setForeground(Color.black);
            Font fun = new Font("Garamond",Font.BOLD,30);
            textFun.setFont(fun);
            
            JLabel textDes = new JLabel("<html> 1. You may Add Student into this System. <br> 2. You may the wrong information. <br> 3. You may delete the information from the table.<br>4. Last is click the button to Exit System.<br>Thank you MS Rashidah !</html>"); 
            textDes.setLayout(new FlowLayout());
            d.add(textDes,FlowLayout.LEFT);
            textDes.setForeground(new Color(255,85,0));
            Font Des = new Font("Arial",Font.PLAIN,20);
            textDes.setFont(Des);
            
            ImageIcon out = new ImageIcon("C:\\Users\\hqtey\\Documents\\NetBeansProjects\\Java Assignment\\src\\exit.png");
            
            JButton exit = new JButton("<html><br>Click Me to Exit<br><br></html>",out);
            d.add(exit,BorderLayout.SOUTH);
            exit.setLayout(new BorderLayout());
            
            exit.addActionListener(new ActionListener()
            {
                @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
             });
            } 
        });
        frame.setSize(1000,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}