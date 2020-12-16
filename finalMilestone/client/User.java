package client;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JPanel {
    private String name;
    private JTextField nameField;

    public User(String name) {
	this.name = name;
	nameField = new JTextField(name);
	nameField.setEditable(false);
	this.setLayout(new BorderLayout());
	this.add(nameField);
    }

    public String getName() {
	

//finds users and highlights users name

if(e.getName() == User){
    String s = (String)JOptionPane.showInputDialog("Find User", "Please search for a user");
   if(m_area.getText().contains(s)){
     String text = m_area.getText();
     int start = text.indexOf(s);
     while (start >= 0) {
       int length = start + s.length();
       try {
           highlight.addHighlight(start, length, painter);
       } catch (BadLocationException e1) {
           e1.printStackTrace();
       }
       start = text.indexOf(s, start + 1);
    }
     return name;
     
   }
   
}
